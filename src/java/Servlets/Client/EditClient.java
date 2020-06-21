package Servlets.Client;

import Controller.ClientController;
import Model.Client;
import Model.ClientProperties;
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
public class EditClient extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fname = request.getParameter("fname");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        
        if(fname.isEmpty()){
            response.getWriter().print("name");
        } else if (phone.isEmpty() || InvalidNumber(phone) < 0) {
            response.getWriter().print("phone");
        } else if (address.isEmpty()) {
            response.getWriter().print("address");
        } else {
            SessionFactory session = (SessionFactory) request.getServletContext().getAttribute("factory");
            Client c = (Client)request.getSession().getAttribute("client");
            ClientController cc1 = new ClientController(session);
            ClientController cc2 = new ClientController(session);
            ClientProperties clientproperties = cc1.ClientProperties(c);
            clientproperties.setName(fname);
            clientproperties.setPhone(phone);
            clientproperties.setAddress(address);
            cc2.editClientProperties(clientproperties);
            c.setClientproperties(clientproperties);
            response.getWriter().print("success");
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
