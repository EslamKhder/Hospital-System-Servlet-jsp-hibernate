package Servlets.Filter;

import Model.Doctor;
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
public class DoctorFilterJsp implements Filter {
   @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
         HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        Doctor doctor = (Doctor) req.getSession().getAttribute("doctor");
        if(doctor == null){
            res.sendRedirect("loginDoctor.jsp");
        } else {
            chain.doFilter(request, response);
        }
    }
}