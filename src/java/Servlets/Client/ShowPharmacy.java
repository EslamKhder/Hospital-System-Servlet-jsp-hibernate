package Servlets.Client;

import Controller.ClientController;
import Model.Booking;
import Model.Client;
import java.io.IOException;
import java.util.ArrayList;
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
        ClientController cc = new ClientController();
        List<Booking> booking = null;
        SessionFactory sessionf = (SessionFactory) request.getServletContext().getAttribute("factory");
        booking = cc.Pharmecy(sessionf,client);
        request.setAttribute("BOOKING", booking);
        request.getRequestDispatcher("view/Hospital/Services/Client/Pharmacy.jsp").include(request, response);
    }
}