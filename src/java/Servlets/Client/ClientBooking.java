package Servlets.Client;

import Controller.ClientController;
import Controller.DoctorController;
import Model.Client;
import Model.Doctor;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.SessionFactory;

public class ClientBooking extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String spec = request.getParameter("spec");
            SessionFactory session = (SessionFactory) request.getServletContext().getAttribute("factory");
            Client client = (Client) request.getSession().getAttribute("client");
            Doctor doctor = new Doctor();
            doctor.setSpecialty(spec);
            DoctorController dc = new DoctorController();
            int id = dc.getDoctorSpecId(session, doctor);
            doctor.setId(id);
            ClientController cc = new ClientController();
            if (cc.isBooking(session, client, doctor) == 1) {
                response.getWriter().print("invalid");
            } else {
                cc.Booking(doctor, client, session);
                response.getWriter().print("success");
            }

    }
}
