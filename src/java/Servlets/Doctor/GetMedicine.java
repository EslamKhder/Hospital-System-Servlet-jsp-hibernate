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
import javax.swing.JOptionPane;
import org.hibernate.SessionFactory;

public class GetMedicine extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String idclient = request.getParameter("idclient");
        String medicine = request.getParameter("medicine");
        if (medicine.isEmpty()) {
            response.getWriter().print("medicine");
        } else {
            SessionFactory session = (SessionFactory) request.getServletContext().getAttribute("factory");
            Client client = new Client();
            client.setId(Integer.parseInt(idclient));
            Doctor doctor = (Doctor) request.getSession().getAttribute("doctor");
            DoctorController dc1 = new DoctorController(session);
            DoctorController dc2 = new DoctorController(session);
            DoctorController dc3 = new DoctorController(session);
            ClientController cc1 = new ClientController(session);
            ClientController cc2 = new ClientController(session);
            Booking book = cc1.myBooking(client, doctor);
            Pharmacy pharmacy = new Pharmacy(medicine, book);
            dc1.giveMedicine(pharmacy);
            book.setAcceptdoctor(1);
            book.setPharmacy(pharmacy);
            cc2.editBooking(book);
            int balance = dc2.getDoctorBalance(doctor);
            doctor.setBalance(balance + 100);
            dc3.editDoctor(doctor);
            response.getWriter().print("success");
        }
        }catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.toString());

        }
        
        }
    }

