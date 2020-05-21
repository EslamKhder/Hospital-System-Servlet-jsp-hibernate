package org.apache.jsp.view.Hospital.Login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!--\n");
      out.write("Author: W3layouts\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Slide Login Form Flat Responsive Widget Template :: w3layouts</title>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"keywords\" content=\"Slide Login Form template Responsive, Login form web template, Flat Pricing tables, Flat Drop downs Sign up Web Templates, Flat Web Templates, Login sign up Responsive web template, SmartPhone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            addEventListener(\"load\", function () {\n");
      out.write("                setTimeout(hideURLbar, 0);\n");
      out.write("            }, false);\n");
      out.write("\n");
      out.write("            function hideURLbar() {\n");
      out.write("                window.scrollTo(0, 1);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <!-- Custom Theme files -->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link href=\"css/admin.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link href=\"css/mediaquey.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <!-- //Custom Theme files -->\n");
      out.write("\n");
      out.write("        <!-- web font -->\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Hind:300,400,500,600,700\" rel=\"stylesheet\">\n");
      out.write("        <!-- //web font -->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- main -->\n");
      out.write("        <div class=\"w3layouts-main\">\n");
      out.write("\n");
      out.write("            <div class=\"bg-layer\">\n");
      out.write("                <a href=\"#\" class=\"part_line\">\n");
      out.write("                    <i class=\"fa fa-caret-right\"></i> Contact Us\n");
      out.write("                </a>\n");
      out.write("                <a href=\"#\" class=\"part_line\">\n");
      out.write("                    <i class=\"fa fa-caret-right\"></i> About Us\n");
      out.write("                </a>\n");
      out.write("                <h1>Hospital Mange</h1>\n");
      out.write("                <div class=\"header-main\">\n");
      out.write("                    <div class=\"main-icon\">\n");
      out.write("                        <span class=\"fa fa-eercast\"></span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"header-left-bottom\">\n");
      out.write("\n");
      out.write("                        <form>\n");
      out.write("                            \n");
      out.write("                            <div class=\"icon1 one\">\n");
      out.write("                                <span class=\"fa fa-user\"></span>\n");
      out.write("                                <input type=\"text\" placeholder=\"ID\" id=\"code\" class=\"inputid\" required pattern=\"[0-9]{1,}\" title=\"must include only number\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"icon1\">\n");
      out.write("                                <span class=\"fa fa-lock\"></span>\n");
      out.write("                                <input type=\"password\" id=\"password\" placeholder=\"Password\" required/>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"inv\"></div>\n");
      out.write("                            <!--\n");
      out.write("                                <div class=\"links\">\n");
      out.write("                                        <p class=\"right\"><a href=\"../new user/new user.html\">Create New Account</a></p>\n");
      out.write("                                        <div class=\"clear\"></div>\n");
      out.write("                                </div>\n");
      out.write("                            -->\n");
      out.write("                        </form>\n");
      out.write("                        <div class=\"bottom\">\n");
      out.write("                            <button class=\"btn\" onclick=\"login()\">Log In</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- facebook and Twitter -->\n");
      out.write("                <a href=\"#\" class=\"fl_fb\">\n");
      out.write("                    <span class=\"fbicon\"><i class=\"fa fa-facebook\"></i></span>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"#\" class=\"fl_tw\">\n");
      out.write("                    <span class=\"twicon\"><i class=\"fa fa-twitter\"></i></span> \n");
      out.write("                </a>\n");
      out.write("                <!-- copyright -->\n");
      out.write("                <div class=\"copyright\">\n");
      out.write("                    <p>© 2020 Our Team</p>\n");
      out.write("                </div>\n");
      out.write("                <!-- //copyright --> \n");
      out.write("            </div>\n");
      out.write("        </div>\t\n");
      out.write("        <!-- //main -->\n");
      out.write("        <script src=\"javascript/Admin.js\"></script>\n");
      out.write("    </body>\n");
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
