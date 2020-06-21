/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets.Client;

import Controller.ClientController;
import Model.Booking;
import Model.Client;
import java.io.IOException;
import java.io.PrintWriter;
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
public class ClientReservationsToday extends HttpServlet {


    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Client client = (Client) request.getSession().getAttribute("client");
        List<Booking> booking = null;
        SessionFactory sessionf = (SessionFactory) request.getServletContext().getAttribute("factory");
        ClientController cc = new ClientController(sessionf);
        booking = cc.clientReservationsToday(client);
        request.setAttribute("BOOKING", booking);
        request.getRequestDispatcher("view/ClientReservationsToday.jsp").include(request, response);
    }

}
