package org.apache.jsp.view.Hospital.Theproject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ClientReservations_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Doctor Data</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!--===============================================================================================-->\t\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"images/icons/favicon.ico\"/>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animate.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/select2/select2.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/perfect-scrollbar/perfect-scrollbar.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"util.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"SDData.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"limiter\">\n");
      out.write("            <div class=\"container-table100\">\n");
      out.write("                <div class=\"wrap-table100\">\n");
      out.write("                    <div>\n");
      out.write("                        <p style=\"\n");
      out.write("                           text-align: center;\n");
      out.write("                           padding-bottom: 30px;\n");
      out.write("                           font-weight: bolder;\n");
      out.write("                           font-family: cursive;\n");
      out.write("                           font-size: 60px;\n");
      out.write("                           color: white;\n");
      out.write("                           \">\n");
      out.write("                            DOCTOR DATA\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"table\">\n");
      out.write("\n");
      out.write("                        <div class=\"row header\">\n");
      out.write("                            <div class=\"cell\">\n");
      out.write("                                ID\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"cell\">\n");
      out.write("                                FULL NAME\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"cell\">\n");
      out.write("                                SPECIALIZATION\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"cell\">\n");
      out.write("                                SALARY\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"cell\">\n");
      out.write("                                ADDRESS\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"cell\">\n");
      out.write("                                PHONE NUMBER\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"cell\">\n");
      out.write("                                CERTIFICATE\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"cell\" data-title=\"Id\">\n");
      out.write("                                21\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"cell\" data-title=\"Full Name\">\n");
      out.write("                                Ahmed Gad\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"cell\" data-title=\"Specialization\">\n");
      out.write("                                Oculist\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"cell\" data-title=\"Salary\">\n");
      out.write("                                1200$\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"cell\" data-title=\"Address\">\n");
      out.write("                                Al-Haram\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"cell\" data-title=\"Phone Number\">\n");
      out.write("                                01239871564\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"cell\" data-title=\"Certificate\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                            <div class=\"cell\" data-title=\"Certificate\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        <!--===============================================================================================-->\t\n");
      out.write("        <script src=\"vendor/jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"vendor/bootstrap/js/popper.js\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"vendor/select2/select2.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
