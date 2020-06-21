package Servlets.Client;

import Controller.ClientController;
import Model.Client;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.SessionFactory;

public class LoginClient extends HttpServlet {

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
            Client client = new Client();
            client.setCode(code);
            client.setPassword(password);
            SessionFactory session = (SessionFactory) request.getServletContext().getAttribute("factory");
            ClientController clientcontroller = new ClientController(session);
            client = clientcontroller.IsExist(client);
            if (client != null) {
                Cookie c1 = new Cookie("codeclient", code);
                Cookie c2 = new Cookie("passwordclient", password);
                c1.setMaxAge(60 * 60 * 24);
                c2.setMaxAge(60 * 60 * 24);
                response.addCookie(c1);
                response.addCookie(c2);
                request.getSession().setAttribute("client", client);
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
