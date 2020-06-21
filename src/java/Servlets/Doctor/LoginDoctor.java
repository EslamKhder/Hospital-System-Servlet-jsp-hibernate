package Servlets.Doctor;

import Controller.DoctorController;
import Model.Doctor;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import org.hibernate.SessionFactory;

public class LoginDoctor extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String code = request.getParameter("code").trim();
            String password = request.getParameter("password");
            String spec = request.getParameter("spec");
            if (InvalidNumber(code) < 0) {
                response.getWriter().print("code");
            } else if (password.isEmpty()) {
                response.getWriter().print("password");
            } else {
                SessionFactory session = (SessionFactory) request.getServletContext().getAttribute("factory");
                Doctor doctor = new Doctor(code, password, spec);
                DoctorController doctorcontroller = new DoctorController(session);
                doctor = doctorcontroller.isExist(doctor);
                if (doctor != null) {
                    Cookie c1 = new Cookie("codedoctor", code);
                    Cookie c2 = new Cookie("passworddoctor", password);
                    c1.setMaxAge(60 * 60 * 24);
                    c2.setMaxAge(60 * 60 * 24);
                    response.addCookie(c1);
                    response.addCookie(c2);
                    request.getSession().setAttribute("doctor", doctor);
                    response.getWriter().print("success");
                } else {
                    response.getWriter().print("invalid");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
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
