package Servlets.Doctor;

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

public class CancelBookingDoctor extends HttpServlet {
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String idclient = request.getParameter("idclient");
            SessionFactory session = (SessionFactory) request.getServletContext().getAttribute("factory");
            Client client = new Client();
            client.setId(Integer.parseInt(idclient));
            Doctor doctor = (Doctor) request.getSession().getAttribute("doctor");
            DoctorController dc = new DoctorController();
            ClientController cc = new ClientController();
            cc.removeBooking(doctor, client, session);
            client = cc.getClientData(client, session);
            client.setBalance(client.getBalance() + 100);
            cc.editClient(client, session);
            request.getSession().setAttribute("client", cc.getClientData(client, session));
            request.getSession().setAttribute("doctor", dc.getDoctorID(session, doctor));
            response.getWriter().print("success");
        
    }

}
