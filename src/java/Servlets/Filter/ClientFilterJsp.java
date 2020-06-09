package Servlets.Filter;


import Model.Client;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Eng Eslam khder
 */
public class ClientFilterJsp implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
         HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        Client client = (Client) req.getSession().getAttribute("client");
        if(client == null){
            res.sendRedirect("loginClient.jsp");
        } else {
            chain.doFilter(request, response);
        }
    }   
     
}
