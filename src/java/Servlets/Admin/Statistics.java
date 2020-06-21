package Servlets.Admin;

import Controller.ClientController;
import Model.Booking;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.SessionFactory;

public class Statistics extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Booking> booking = null;
        SessionFactory sessionf = (SessionFactory) request.getServletContext().getAttribute("factory");
        ClientController cc = new ClientController(sessionf);
        booking = cc.statisticsBooking();
        request.setAttribute("BOOKING", booking);
        request.getRequestDispatcher("view/Statistics.jsp").include(request, response);

    }

}
