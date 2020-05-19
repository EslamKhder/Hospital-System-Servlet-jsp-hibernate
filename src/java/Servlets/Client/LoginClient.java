package Servlets.Client;

import Controller.ClientController;
import Model.Client;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.SessionFactory;

public class LoginClient extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int code = InvalidNumber(request.getParameter("code"));
        String password = request.getParameter("password");

        if (code < 0) {
            response.getWriter().print("code");
        } else if (password.isEmpty()) {
            response.getWriter().print("password");
        } else {
            Client client = new Client();
            client.setCode(code);
            client.setPassword(password);
            ClientController clientcontroller = new ClientController();
            SessionFactory session = (SessionFactory) request.getServletContext().getAttribute("factory");
            client = clientcontroller.IsExist(client, session);
            if (client != null) {
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
