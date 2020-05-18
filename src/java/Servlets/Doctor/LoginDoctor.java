package Servlets.Doctor;

import Controller.DoctorController;
import Model.Doctor;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.SessionFactory;

public class LoginDoctor extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            int code = InvalidNumber(request.getParameter("code"));
            String password = request.getParameter("password");
            String spec = request.getParameter("spec");
            if (code <= 0) {
                response.getWriter().print("code");
            } else if (password.isEmpty()) {
                response.getWriter().print("password");
            } else {
                SessionFactory session = (SessionFactory) request.getServletContext().getAttribute("factory");
                Doctor doctor = new Doctor(code, password, spec);
                DoctorController doctorcontroller = new DoctorController();
                doctor = doctorcontroller.IsExist(session, doctor);
                if (doctor != null) {
                    request.getSession().setAttribute("doctor", doctor);
                    response.getWriter().print("success");
                } else {
                    response.getWriter().print("invalid");
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
