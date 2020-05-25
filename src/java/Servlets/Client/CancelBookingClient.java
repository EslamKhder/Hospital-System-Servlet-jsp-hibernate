package Servlets.Client;

import Controller.ClientController;
import Controller.DoctorController;
import Model.Client;
import Model.ClientProperties;
import Model.Doctor;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import org.hibernate.SessionFactory;

/**
 *
 * @author Eng Eslam khder
 */
public class CancelBookingClient extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String iddoctor = request.getParameter("iddoctor");
            SessionFactory session = (SessionFactory) request.getServletContext().getAttribute("factory");
            Client client = (Client) request.getSession().getAttribute("client");
            Doctor doctor = new Doctor();
            DoctorController dc = new DoctorController();
            doctor.setId(Integer.parseInt(iddoctor));
            ClientController cc = new ClientController();
            cc.removeBooking(doctor, client, session);
            client.setBalance(client.getBalance() + 100);
            cc.editClient(client, session);
            response.getWriter().print("success");
    }
}
