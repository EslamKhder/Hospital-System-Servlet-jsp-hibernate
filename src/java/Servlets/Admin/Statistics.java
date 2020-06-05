package Servlets.Admin;

import Controller.ClientController;
import Model.Booking;
import java.io.IOException;
import java.util.ArrayList;
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
        ClientController cc = new ClientController();
        List<Booking> booking = null;
        SessionFactory sessionf = (SessionFactory) request.getServletContext().getAttribute("factory");
        booking = cc.statisticsBooking(sessionf);
        request.setAttribute("BOOKING", booking);
        request.getRequestDispatcher("view/Hospital/Services/Admin/Statistics.jsp").include(request, response);

    }

}
