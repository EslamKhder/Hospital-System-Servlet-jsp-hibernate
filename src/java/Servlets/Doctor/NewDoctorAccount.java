package Servlets.Doctor;

import Controller.DoctorController;
import Model.Doctor;
import Model.DoctorProperties;
import Model.Enums.Gender;
import java.io.IOException;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.SessionFactory;

/**
 *
 * @author Eng Eslam khder
 */
public class NewDoctorAccount extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String code = request.getParameter("code").trim();
        String password = request.getParameter("password");
        String name = request.getParameter("name").trim();
        String phone = request.getParameter("phone").trim();
        String gender = request.getParameter("gender").trim();
        String spec = request.getParameter("spec").trim();
        if (InvalidNumber(code) < 0) {
            response.getWriter().print("code");
        } else if (password.isEmpty()) {
            response.getWriter().print("password");
        } else if (password.toCharArray().length < 7) {
            response.getWriter().print("numpassword");
        } else if (name.isEmpty() || !(Pattern.matches("[a-zA-Z ]+", name))) {
            response.getWriter().print("name");
        } else if (InvalidNumber(phone) == -1 || phone.isEmpty() || phone.toCharArray().length != 11) {
            response.getWriter().print("phone");
        } else if (gender.isEmpty()) {
            response.getWriter().print("gender");
        } else {
            Gender gen;
            if (gender.equalsIgnoreCase("male")) {
                gen = Gender.Male;
            } else {
                gen = Gender.FeMale;
            }
            SessionFactory session = (SessionFactory) request.getServletContext().getAttribute("factory");
            DoctorProperties doctorproperties = new DoctorProperties(phone, gen, name);
            Doctor doctor = new Doctor(code, password, spec, doctorproperties);
            DoctorController dc = new DoctorController(session);
            if (dc.addDoctor(doctor) == 1) {
                response.getWriter().print("success");
            } else {
                response.getWriter().print("code");
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
