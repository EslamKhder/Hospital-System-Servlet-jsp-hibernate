package Servlets.Doctor;

import Controller.DoctorController;
import Model.Doctor;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.SessionFactory;


public class AllDoctorProfile extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DoctorController dc = new DoctorController();
        SessionFactory sessionf = (SessionFactory) request.getServletContext().getAttribute("factory");
        List<Doctor> doctors = null;
        doctors = dc.allDoctor(sessionf);
        request.setAttribute("DOCTORS", doctors);
        request.getRequestDispatcher("view/Hospital/Services/Doctor/AllDoctorProfile.jsp").include(request, response);
    }
}
