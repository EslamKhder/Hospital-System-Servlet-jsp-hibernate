/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Controller.ClientController;
import Controller.DoctorController;
import Model.Client;
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
public class Booking extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        String spec = request.getParameter("spec");
//        Client client1 = (Client) request.getSession().getAttribute("client");
//        SessionFactory session = (SessionFactory) request.getServletContext().getAttribute("Connect");
//        DoctorController dc = new DoctorController();
//        Doctor doctor1 = dc.getDoctorSpec(session, spec);
//        JOptionPane.showMessageDialog(null, doctor1.getSpecialty());
//        ClientController clientcontroller = new ClientController();
//        int res = clientcontroller.addBooking(session, client1, doctor1);
//        if (res == 1) {
//            response.sendRedirect("view/Hospital/Theproject/MClient.jsp");
//        }

    }
}
