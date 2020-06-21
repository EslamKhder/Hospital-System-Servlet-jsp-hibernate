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

public class ShowPharmacy extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        Client client = (Client) request.getSession().getAttribute("client");
        List<Booking> booking = null;
        SessionFactory sessionf = (SessionFactory) request.getServletContext().getAttribute("factory");
        ClientController cc = new ClientController(sessionf);
        booking = cc.Pharmecy(client);
        request.setAttribute("BOOKING", booking);
        request.getRequestDispatcher("view/Pharmacy.jsp").include(request, response);
    }
}