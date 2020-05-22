package org.apache.jsp.view.Hospital.Services.DoctorAndClient;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RemoveDoctor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("Author: W3layouts\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zxx\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <title>Master Signin Form Flat Responsive Widget Template :: W3layouts</title>\n");
      out.write("    <!-- Meta tag Keywords -->\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta name=\"keywords\"\n");
      out.write("        content=\"Master Signin Form Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("    <!-- //Meta tag Keywords -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\" /><!-- Style-CSS -->\n");
      out.write("    <link href=\"css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\"/>\n");
      out.write("<!-- font-awesome-icons -->\n");
      out.write("</head>\n");
      out.write("<div class=\"myname\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.doctor.getDoctorproperties().getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("\n");
      out.write("    <section class=\"signin-form\">\n");
      out.write("        <div class=\"overlay\">\n");
      out.write("            <div class=\"wrapper\">\n");
      out.write("                <div class=\"logo text-center top-bottom-gap\">\n");
      out.write("                    <a class=\"brand-logo\">Remove Doctor</a>\n");
      out.write("                    <!-- if logo is image enable this\n");
      out.write("\t\t\t<a class=\"brand-logo\" href=\"#index.html\">\n");
      out.write("\t\t\t    <img src=\"image-path\" alt=\"Your logo\" title=\"Your logo\" style=\"height:35px;\" />\n");
      out.write("\t\t\t</a> -->\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form34\">\n");
      out.write("                    \n");
      out.write("                    <form>\n");
      out.write("                        <div>\n");
      out.write("                            <p class=\"text-head\">Enter Code (Doctor) : </p>\n");
      out.write("                            <input type=\"text\" id=\"code\" class=\"input\" placeholder=\"Your Code\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"Code\"></div>\n");
      out.write("                        <div>\n");
      out.write("                            <p class=\"text-head\">Enter Password (Admin): </p>\n");
      out.write("                            <input type=\"password\" id=\"password1\" class=\"input\" placeholder=\"Your Password\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"Password1\"></div>\n");
      out.write("                        <div>\n");
      out.write("                            <p class=\"text-head\">Again Password (Admin) : </p>\n");
      out.write("                            <input type=\"password\" id=\"password2\" class=\"input\" placeholder=\"Your Password\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"Password2\"></div>\n");
      out.write("                    </form>\n");
      out.write("                    <div id=\"Error\"></div>\n");
      out.write("                    <button class=\"signinbutton btn\" onclick=\"Edit();\">Done</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- copyright -->\n");
      out.write("\t\t<div class=\"copyright text-center\">\n");
      out.write("                <p>© 2019 Eslam Khder</p>\n");
      out.write("            </div>\n");
      out.write("            <!-- //copyright --> \n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("<script src=\"js/RemoveDoctor.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
