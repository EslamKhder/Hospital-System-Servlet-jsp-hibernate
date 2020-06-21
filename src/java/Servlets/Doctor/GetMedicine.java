package Servlets.Doctor;

import Controller.ClientController;
import Controller.DoctorController;
import Model.Booking;
import Model.Client;
import Model.Doctor;
import Model.Pharmacy;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.SessionFactory;

public class GetMedicine extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idclient = request.getParameter("idclient");
        String medicine = request.getParameter("medicine");
        if (medicine.isEmpty()) {
            response.getWriter().print("medicine");
        } else {
            SessionFactory session = (SessionFactory) request.getServletContext().getAttribute("factory");
            Client client = new Client();
            client.setId(Integer.parseInt(idclient));
            Doctor doctor = (Doctor) request.getSession().getAttribute("doctor");
            DoctorController dc = new DoctorController(session);
            ClientController cc = new ClientController(session);
            Booking book = cc.myBooking(client, doctor);
            Pharmacy pharmacy = new Pharmacy(medicine, book);
            dc.giveMedicine(pharmacy);
            book.setAcceptdoctor(1);
            book.setPharmacy(pharmacy);
            cc.editBooking(book);
            int balance = dc.getDoctorBalance(doctor);
            doctor.setBalance(balance + 100);
            dc.editDoctor(doctor);
            response.getWriter().print("success");
        }
    }

}
