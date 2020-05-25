package Servlets.Client;

import Controller.AdminController;
import Controller.ClientController;
import Model.Admin;
import Model.Client;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import org.hibernate.SessionFactory;

public class ClientBalance extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int balance = InvalidNumber(request.getParameter("balance").trim());
        String password1 = request.getParameter("password1");
        String password2 = request.getParameter("password2");

        if (balance < 0) {
            response.getWriter().print("balance");
        } else if (password1.isEmpty()) {
            response.getWriter().print("password1");
        } else if (password2.isEmpty()) {
            response.getWriter().print("password2");
        } else if (!(password1.equals(password2))) {
            response.getWriter().print("identical");
        } else {
                SessionFactory session = (SessionFactory) request.getServletContext().getAttribute("factory");
                ClientController cc = new ClientController();
                Client client = (Client) request.getSession().getAttribute("client");

                AdminController am = new AdminController();
                Admin admin = am.getAdmin(session);
                if (admin.getPassword().equals(password2)) {
                    client.setBalance(balance + client.getBalance());
                    cc.editClient(client, session);
                    request.getSession().removeAttribute("client");
                    request.getSession().setAttribute("client",client);
                    response.getWriter().print("success");
                } else {
                    response.getWriter().print("invalidadmin");
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
