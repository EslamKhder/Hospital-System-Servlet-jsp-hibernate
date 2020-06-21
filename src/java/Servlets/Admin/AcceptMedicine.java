package Servlets.Admin;

import Controller.ClientController;
import Model.Booking;
import Model.Client;
import Model.Doctor;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.SessionFactory;

/**
 *
 * @author Eng Eslam khder
 */
public class AcceptMedicine extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idclient = Integer.parseInt(request.getParameter("idclient"));
        int iddoctor = Integer.parseInt(request.getParameter("iddoctor"));
        String password = request.getParameter("password");
        String date = request.getParameter("date");
        if (password.isEmpty()) {
            response.getWriter().print("password");
        } else {
            SessionFactory session = (SessionFactory) request.getServletContext().getAttribute("factory");
            Client client = new Client();
            client.setId(idclient);
            ClientController cc = new ClientController(session);
            client = cc.getClientData(client);
            if (client.getPassword().equals(password)) {
                Doctor doctor = new Doctor();
                doctor.setId(iddoctor);
                List<Booking> book = cc.onlyBooking(client, doctor);
                book.get(0).setAcceptmedicine(1);
                cc.editBooking(book.get(0));
                response.getWriter().print("success");
            } else {
                response.getWriter().print("password");
            }
        }
    }
}
