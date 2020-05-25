package Servlets.Doctor;

import Controller.AdminController;
import Controller.DoctorController;
import Model.Admin;
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
public class RemoveDoctor extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String code = request.getParameter("code").trim();
        String password1 = request.getParameter("password1");
        String password2 = request.getParameter("password2");
        if (InvalidNumber(code) < 0) {
            response.getWriter().print("code");
        } else if (password1.isEmpty()) {
            response.getWriter().print("password1");
        } else if (password2.isEmpty()) {
            response.getWriter().print("password2");
        } else if (!(password1.equals(password2))) {
            response.getWriter().print("identical");
        } else {
            SessionFactory sessionf = (SessionFactory) request.getServletContext().getAttribute("factory");
            DoctorController dc = new DoctorController();
            Doctor doctor = new Doctor();
            doctor.setCode(code);
            doctor = dc.getDoctorCode(sessionf, doctor);
            if (doctor != null) {
                AdminController ac = new AdminController();
                Admin ad = ac.getAdmin(sessionf);
                if (ad.getPassword().equals(password2)) {
                    dc.removeDoctor(sessionf, doctor);
                    response.getWriter().print("success");
                } else {
                    response.getWriter().print("invalid");
                }
            } else {
                response.getWriter().print("codeexist");
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
