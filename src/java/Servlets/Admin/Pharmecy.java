/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author Eng Eslam khder
 */
public class Pharmecy extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Booking> booking = null;
        SessionFactory sessionf = (SessionFactory) request.getServletContext().getAttribute("factory");
        ClientController cc = new ClientController(sessionf);
        booking = cc.PharmecyBooking();
        request.setAttribute("BOOKING", booking);
        request.getRequestDispatcher("view/Pharmecy.jsp").include(request, response);
    }

}
