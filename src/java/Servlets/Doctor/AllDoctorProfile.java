package Servlets.Doctor;

import Controller.DoctorController;
import Model.Doctor;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import org.hibernate.SessionFactory;


public class AllDoctorProfile extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        SessionFactory sessionf = (SessionFactory) request.getServletContext().getAttribute("factory");
        DoctorController dc = new DoctorController(sessionf);
        List<Doctor> doctors = null;
        doctors = dc.allDoctor();
        request.setAttribute("DOCTORS", doctors);
        request.getRequestDispatcher("view/AllDoctorProfile.jsp").include(request, response);
    }
}
