package org.apache.jsp.view.Hospital.Main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MainClient_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <div class=\"doller\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.client.getBalance()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <i class=\"fas fa-dollar-sign\"></i></div>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <!-- IE Compatibility Meta -->\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <!-- First Mobile Meta -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title></title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\" type=\"text/css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/rtl.css\" type=\"text/css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/all.min.css\" type=\"text/css\" />\n");
      out.write("        <!--[if lt IE 9] -->\n");
      out.write("        <script src=\"js/html5shiv.min.js\"></script>\n");
      out.write("        <script src=\"js/respond.min.js\"></script>\n");
      out.write("        <!--[endif]-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<!-- Start NavBar -->\n");
      out.write("            <nav class=\"navbar navbar-inverse\">\n");
      out.write("                  <div class=\"container-fluid\">\n");
      out.write("                      \n");
      out.write("                    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        \n");
      out.write("                      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                      </button>\n");
      out.write("                      <a class=\"navbar-brand\">Hospital</a>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                            \n");
      out.write("                          <ul class=\"nav navbar-nav\">\n");
      out.write("                              <li class=\"active\"><a>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.client.getClientproperties().getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <i class=\"fas fa-female\"></i><span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("                          </ul>\n");
      out.write("                          <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                          \n");
      out.write("                            <li class=\"call\"><a href=\"\">My Profile<i class=\"fas fa-user-friends\"></i></a></li>\n");
      out.write("                            <li class=\"dropdown\">\n");
      out.write("                              <a class=\"dropdown-toggle up\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Control Center <span class=\"caret \"><i class=\"fab fa-windows hidden-xs\"></i></span></a>\n");
      out.write("                              <ul class=\"dropdown-menu\">\n");
      out.write("                                  <li><a href=\"../Services/roombook.jsp\"><i class=\"fas fa-user-plus\"></i> &nbsp; Detection Reservation</a></li>\n");
      out.write("                                <li><a href=\"\"><i class=\"fas fa-laptop-medical\"></i> &nbsp; pharmacy</a></li>\n");
      out.write("                                <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("                                <li><a href=\"../Services/Client/ClientReservations.jsp\"><i class=\"fas fa-user-edit\"></i> &nbsp; My Reservations</a></li>\n");
      out.write("                              </ul>\n");
      out.write("                            </li>\n");
      out.write("                          </ul>\n");
      out.write("                        </div>\n");
      out.write("                    <!-- /.navbar-collapse -->\n");
      out.write("                  </div>\n");
      out.write("                <!-- /.container-fluid -->\n");
      out.write("            </nav>\n");
      out.write("        <!-- End NavBar -->\n");
      out.write("\t\t<!-- Start Carousel -->\n");
      out.write("        <div class=\"caro-life\">\n");
      out.write("            <div id=\"carousel-example-generic\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("              <!-- Indicators -->\n");
      out.write("              <ol class=\"carousel-indicators\">\n");
      out.write("                <li data-target=\"#carousel-example-generic\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                <li data-target=\"#carousel-example-generic\" data-slide-to=\"1\"></li>\n");
      out.write("                <li data-target=\"#carousel-example-generic\" data-slide-to=\"2\"></li>\n");
      out.write("                <li data-target=\"#carousel-example-generic\" data-slide-to=\"3\"></li>\n");
      out.write("                <li data-target=\"#carousel-example-generic\" data-slide-to=\"4\"></li>\n");
      out.write("                <li data-target=\"#carousel-example-generic\" data-slide-to=\"5\"></li>\n");
      out.write("              </ol>\n");
      out.write("\n");
      out.write("              <!-- Wrapper for slides -->\n");
      out.write("              <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("                <div class=\"item active\">\n");
      out.write("                  <img src=\"img/appointment-bg.jpg\" alt=\"Life Makers\">\n");
      out.write("                </div>\n");
      out.write("                  \n");
      out.write("                <div class=\"item\">\n");
      out.write("                  <img src=\"img/blog-details.jpg\" alt=\"Life Makers\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                  \n");
      out.write("                <div class=\"item\">\n");
      out.write("                  <img src=\"img/blog_1.jpg\" alt=\"Life Makers\">\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                  \n");
      out.write("                <div class=\"item\">\n");
      out.write("                  <img src=\"img/blog_2.jpg\" alt=\"Life Makers\">\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                  \n");
      out.write("                <div class=\"item\">\n");
      out.write("                  <img src=\"img/blog_3.jpg\" alt=\"Life Makers\">\n");
      out.write("                </div>\n");
      out.write("                  \n");
      out.write("                <div class=\"item\">\n");
      out.write("                  <img src=\"img/blog_1.jpg\" alt=\"Life Makers\">\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <!-- Controls -->\n");
      out.write("              <a class=\"left carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Previous</span>\n");
      out.write("              </a>\n");
      out.write("              <a class=\"right carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"next\">\n");
      out.write("                <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Next</span>\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("        <!-- End Carousel -->\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/plugins.js\"></script>\n");
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
