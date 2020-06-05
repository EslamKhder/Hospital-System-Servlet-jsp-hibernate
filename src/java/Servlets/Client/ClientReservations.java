
package Servlets.Client;

import Controller.ClientController;
import Model.Booking;
import Model.Client;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.SessionFactory;

public class ClientReservations extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Client client = (Client) request.getSession().getAttribute("client");
        ClientController cc = new ClientController();
        List<Booking> booking = null;
        SessionFactory sessionf = (SessionFactory) request.getServletContext().getAttribute("factory");
        booking = cc.allClientReservation(sessionf,client);
        request.setAttribute("BOOKING", booking);
        request.getRequestDispatcher("view/Hospital/Services/Client/AllClientReservation.jsp").include(request, response);
    }

}
