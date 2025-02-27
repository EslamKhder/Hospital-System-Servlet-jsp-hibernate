package Servlets.Client;

import Controller.ClientController;
import Model.Client;
import Model.ClientProperties;
import Model.Enums.Gender;
import java.io.IOException;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.SessionFactory;

public class NewClientAccount extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String code = request.getParameter("code").trim();
        String password = request.getParameter("password");
        String name = request.getParameter("name").trim();
        String phone = request.getParameter("phone").trim();
        String address = request.getParameter("address").trim();
        int age = InvalidNumber(request.getParameter("age").trim());
        String gender = request.getParameter("gender").trim();
        if (InvalidNumber(code) < 0) {
            response.getWriter().print("code");
        } else if (password.isEmpty()) {
            response.getWriter().print("password");
        } else if (password.toCharArray().length < 7) {
            response.getWriter().print("numpassword");
        } else if (name.isEmpty() || !(Pattern.matches("[a-zA-Z ]+", name))) {
            response.getWriter().print("name");
        } else if (phone.isEmpty() || phone.toCharArray().length != 11 || InvalidNumber(phone) == -1) {
            response.getWriter().print("phone");
        } else if (address.isEmpty()) {
            response.getWriter().print("address");
        } else if (age <= 0) {
            response.getWriter().print("age");
        } else if (gender.isEmpty()) {
            response.getWriter().print("gender");
        } else {
            Gender gen;
            if (gender.equalsIgnoreCase("male")) {
                gen = Gender.Male;
            } else {
                gen = Gender.FeMale;
            }
            ClientProperties clientproperties = new ClientProperties(name, phone, age, gen, address);
            Client client = new Client(code, password, clientproperties);
            SessionFactory session = (SessionFactory) request.getServletContext().getAttribute("factory");
            ClientController clientcontroller = new ClientController(session);
            if (clientcontroller.addClient(client) == 1) {
                client.setId(clientcontroller.getClientId(client));
                Cookie c1 = new Cookie("codeclient", code);
                Cookie c2 = new Cookie("passwordclient", password);
                c1.setMaxAge(60 * 60 * 24);
                c2.setMaxAge(60 * 60 * 24);
                response.addCookie(c1);
                response.addCookie(c2);
                request.getSession().setAttribute("client", client);
                response.getWriter().print("success");
            } else {
                response.getWriter().print("codeexist");
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
