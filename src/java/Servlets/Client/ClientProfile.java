package Servlets.Client;

import Controller.ClientController;
import Model.Client;
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
public class ClientProfile extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        SessionFactory session = (SessionFactory) request.getServletContext().getAttribute("factory");
        ClientController cc = new ClientController();
        Client client = new Client();
        client.setId(Integer.parseInt(id));
        client = cc.getClientData(client, session);
        request.getSession().setAttribute("CLIENT", client);
        response.sendRedirect("view/ClientsProfile.jsp");
    }
}
