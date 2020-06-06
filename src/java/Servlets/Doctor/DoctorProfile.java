/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets.Doctor;

import Controller.DoctorController;
import Model.Doctor;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.SessionFactory;
/**
 *
 * @author Eng Eslam khder
 */
public class DoctorProfile extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        SessionFactory session = (SessionFactory) request.getServletContext().getAttribute("factory");
        Doctor doctor = new Doctor();
        doctor.setId(Integer.parseInt(id));
        DoctorController dc = new DoctorController();
        doctor = dc.getDoctorID(session, doctor);
        request.getSession().setAttribute("DOCTOR", doctor);
        response.sendRedirect("view/DoctorsProfile.jsp");
    }

}
