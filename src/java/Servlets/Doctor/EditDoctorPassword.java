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
public class EditDoctorPassword extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String opassword = request.getParameter("opassword");
        String npassword1 = request.getParameter("npassword1");
        String npassword2 = request.getParameter("npassword2");
        if (opassword.isEmpty()) {
            response.getWriter().print("opassword");
        } else if (npassword1.isEmpty()) {
            response.getWriter().print("npassword1");
        } else if (npassword1.toCharArray().length < 7) {
            response.getWriter().print("npassword1num");
        } else if (npassword2.isEmpty()) {
            response.getWriter().print("npassword2");
        } else if (!(npassword1.equals(npassword2))) {
            response.getWriter().print("invalid");
        } else {
            SessionFactory sessionf = (SessionFactory) request.getServletContext().getAttribute("factory");
            Doctor doctor;
            doctor = (Doctor) request.getSession().getAttribute("doctor");
            DoctorController dc = new DoctorController();
            String password = dc.getPasswordDoctor(sessionf, doctor);
            if (password.equals(opassword)) {
                doctor.setPassword(npassword2);
                dc.editDoctor(sessionf, doctor);
                request.getSession().setAttribute("doctor", dc.getDoctorID(sessionf, doctor));
                response.getWriter().print("success");
            } else {
                response.getWriter().print("opasswordinvalid");
            }

        }
    }
    public int InvalidNumber(String num) {
        try {
            return Integer.parseInt(num);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

}
