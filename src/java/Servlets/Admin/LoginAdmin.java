package Servlets.Admin;

import Controller.AdminController;
import Model.Admin;
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
public class LoginAdmin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            int code = InvalidNumber(request.getParameter("id"));
            String password = request.getParameter("password");
            if (code <= 0) {
                response.getWriter().print("id");
            } else if (password.isEmpty()) {
                response.getWriter().print("password");
            } else {
                AdminController admincontroller = new AdminController();
                SessionFactory session = (SessionFactory) request.getServletContext().getAttribute("factory");
                Admin admin = admincontroller.getAdmin(session);
                if (admin.getCode() == code && admin.getPassword().equals(password)) {
                    request.getSession().setAttribute("admin", admin);
                    response.getWriter().print("success");
                } else {
                    response.getWriter().print("invalid");
                }
            }
        } catch (IOException e) {
            response.getWriter().print("id");
        }
    }

    public int InvalidNumber(String num) {
        try {
            return Integer.parseInt(num);
        } catch (Exception e) {
            return -1;
        }
    }

}
