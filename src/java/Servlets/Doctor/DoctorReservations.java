/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets.Doctor;

import Controller.DoctorController;
import Model.Booking;
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
public class DoctorReservations extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        SessionFactory sessionf = (SessionFactory) request.getServletContext().getAttribute("factory");
        DoctorController dc = new DoctorController(sessionf);
        Doctor doctor = (Doctor) request.getSession().getAttribute("doctor");
        List<Booking> booking = null;
        booking = dc.myBooking(doctor);
        request.setAttribute("BOOKING", booking);
        request.getRequestDispatcher("view/DoctorReservations.jsp").include(request, response);
    }

}
