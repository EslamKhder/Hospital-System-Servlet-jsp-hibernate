package Servlets.Admin;

import Controller.AdminController;
import Model.Admin;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
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
            String code = request.getParameter("code").trim();
            String password = request.getParameter("password");
            if (InvalidNumber(code) < 0) {
                response.getWriter().print("code");
            } else if (password.isEmpty()) {
                response.getWriter().print("password");
            } else {
                SessionFactory session = (SessionFactory) request.getServletContext().getAttribute("factory");
                AdminController admincontroller = new AdminController(session);
                Admin admin = admincontroller.getAdmin();
                if (admin.getCode().equals(code) && admin.getPassword().equals(password)) {
                    Cookie c1 = new Cookie("codeadmin", code);
                    Cookie c2 = new Cookie("passwordadmin", password);
                    c1.setMaxAge(60 * 60 * 24);
                    c2.setMaxAge(60 * 60 * 24);
                    response.addCookie(c1);
                    response.addCookie(c2);
                    request.getSession().setAttribute("admin", admin);
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
