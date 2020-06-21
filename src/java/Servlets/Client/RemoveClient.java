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

/**
 *
 * @author Eng Eslam khder
 */
public class RemoveClient extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String password = request.getParameter("password");

        if (password.isEmpty()) {
            response.getWriter().print("password");
        } else {
            SessionFactory session = (SessionFactory) request.getServletContext().getAttribute("factory");
            ClientController cc1 = new ClientController(session);
            ClientController cc2 = new ClientController(session);
            Client c = (Client) request.getSession().getAttribute("client");
            Client client = cc1.getClientData(c);
            if (client.getPassword().equals(password)) {
                cc2.removeClient(client);
                Cookie c1 = new Cookie("codeclient", "");
                Cookie c2 = new Cookie("passwordclient", "");
                c1.setMaxAge(0);
                c2.setMaxAge(0);
                response.addCookie(c1);
                response.addCookie(c2);
                request.getSession().removeAttribute("client");
                response.getWriter().print("success");
            } else {
                response.getWriter().print("password");
            }
        }
    }
}
