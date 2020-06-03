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
            Client client = (Client) request.getSession().getAttribute("client");
            SessionFactory session = (SessionFactory) request.getServletContext().getAttribute("factory");
            ClientController cc = new ClientController();
            int balance = cc.getClientBalance(client, session);
            if (balance < 100) {
                response.getWriter().print("ivbalance");
            } else {
                DoctorController dc = new DoctorController();
                Doctor doctor = new Doctor();
                doctor.setSpecialty(spec);                
                int id = dc.getDoctorSpecId(session, doctor);
                doctor.setId(id);
                if (cc.isBooking(session, client, doctor) == 1) {
                    response.getWriter().print("invalid");
                } else {
                    cc.Booking(doctor, client, session);
                    client.setBalance(balance - 100);
                    cc.editClient(client, session);
                    response.getWriter().print("success");
                }
            }
    }
}
