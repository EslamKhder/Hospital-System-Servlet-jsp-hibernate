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
        int code = InvalidNumber(request.getParameter("code"));
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String gender = request.getParameter("gender");
        String spec = request.getParameter("spec");
        if (code < 0) {
            response.getWriter().print("code");
        } else if (password.isEmpty()) {
            response.getWriter().print("password");
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
            DoctorController dc = new DoctorController();
            if(dc.addDoctor(session, doctor) == 1){
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
