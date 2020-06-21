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

/**
 *
 * @author Eng Eslam khder
 */
public class AvailableDoctor extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        SessionFactory sessionf = (SessionFactory) request.getServletContext().getAttribute("factory");
        DoctorController cc = new DoctorController(sessionf);
        List<Doctor> doctors  = null;
        doctors = cc.availableDoctor();
        request.setAttribute("DO", doctors);
        request.getRequestDispatcher("view/roombook.jsp").include(request, response);
    }

}