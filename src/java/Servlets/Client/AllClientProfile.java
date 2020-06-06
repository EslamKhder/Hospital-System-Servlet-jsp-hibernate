package Servlets.Client;

import Controller.ClientController;
import Model.Client;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.SessionFactory;

/**
 *
 * @author Eng Eslam khder
 */
public class AllClientProfile extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ClientController cc = new ClientController();
        List<Client> clients = null;
        SessionFactory sessionf = (SessionFactory) request.getServletContext().getAttribute("factory");
        clients = cc.Clients(sessionf);
        request.setAttribute("CLIENTS", clients);
        request.getRequestDispatcher("view/AllClientProfile.jsp").include(request, response);
    }
}
