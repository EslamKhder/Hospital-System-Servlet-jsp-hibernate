package org.apache.jsp.view.Hospital.CreateAccount;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CreateClientAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("        <title>Hospital</title>\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Flaticon -->\n");
      out.write("        <link href=\"css/flaticon.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- Custom Style Sheet -->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- Custom myStyle Sheet -->\n");
      out.write("        <link href=\"css/mystyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- font-awesome -->\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body id=\"page-top\">\n");
      out.write("        <!-- Loader icon -->\n");
      out.write("        <div class=\"se-pre-con\"></div>\n");
      out.write("        <!-- Choose Us Section -->\n");
      out.write("        <section id=\"appointment\" class=\"choose-form-inner\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <!-- Main Title -->\n");
      out.write("                    <div class=\"col-md-6 col-md-offset-3\">\n");
      out.write("                        <div class=\"title-block\">\n");
      out.write("                            <h3>Why Choose Us</h3>\n");
      out.write("                            <p>Our department & special service </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <!-- Appointment Form -->\n");
      out.write("                    <div class=\"col-sm-6 col-md-4\">\n");
      out.write("                        <div id=\"form\" class=\"form-area\">  \n");
      out.write("                            <form>\n");
      out.write("                                <div class=\"form-padding\">\n");
      out.write("                                    <h4>Create New Account </h4>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>code :</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"code\" placeholder=\"Code\" >\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"Code\"></div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Password : </label>\n");
      out.write("                                        <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\" placeholder=\"Password\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"Password\"></div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Name :</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"name\" placeholder=\"Name\" >\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"Name\"></div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Phone Number : </label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"phone\" placeholder=\"Phone Number\" >\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"Phone\"></div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Address : </label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"address\" placeholder=\"Address\" >\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"Address\"></div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Age :</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"age\" placeholder=\"Age\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"Age\"></div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Gender : </label><br>\n");
      out.write("\n");
      out.write("                                        <input type=\"radio\" id=\"male\" name=\"gender\" value=\"male\" />\n");
      out.write("                                        <label for=\"male\">Male</label><br>\n");
      out.write("                                        <input type=\"radio\" id=\"female\" name=\"gender\" value=\"female\">\n");
      out.write("                                        <label for=\"female\">Female</label><br>\n");
      out.write("                                        <div id=\"Gender\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"Gender\"></div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </form>\n");
      out.write("                            <div class=\"form-footer\">\n");
      out.write("                                <div class=\"checkbox\">\n");
      out.write("                                    <div class=\"checkbox\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <input type=\"submit\" value=\"Done\" class=\"btn thm-btn\" onclick=\"newAccount()\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Doctor Image -->\n");
      out.write("                    <div class=\"col-md-4 hidden-sm\">\n");
      out.write("                        <div class=\"doctor_img\">\n");
      out.write("                            <img src=\"images/appointment.png\" class=\"img-responsive\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Reason -->\n");
      out.write("                    <div class=\"col-sm-6 col-md-4\">\n");
      out.write("                        <div class=\"choose\">\n");
      out.write("                            <div class=\"choose-icon\">\n");
      out.write("                                <i class=\"flaticon-telephone icon-color-3\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"choose-content\">\n");
      out.write("                                <h4>Health Information</h4>\n");
      out.write("                                <p>Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"choose\">\n");
      out.write("                            <div class=\"choose-icon\">\n");
      out.write("                                <i class=\"flaticon-microscope icon-color-6\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"choose-content\">\n");
      out.write("                                <h4>Medical Education</h4>\n");
      out.write("                                <p>Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"choose\">\n");
      out.write("                            <div class=\"choose-icon\">\n");
      out.write("                                <i class=\"flaticon-medical-2 icon-color-4 \"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"choose-content\">\n");
      out.write("                                <h4>Symptom Check</h4>\n");
      out.write("                                <p>Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"choose\">\n");
      out.write("                            <div class=\"choose-icon\">\n");
      out.write("                                <i class=\"flaticon-people-1 icon-color-7\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"choose-content\">\n");
      out.write("                                <h4>Qualified Doctors</h4>\n");
      out.write("                                <p>Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- facebook and Twitter -->\n");
      out.write("            <a href=\"#\" class=\"fl_fb\">\n");
      out.write("                <span class=\"fbicon\"><i class=\"fa fa-facebook\"></i></span>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\" class=\"fl_tw\">\n");
      out.write("                <span class=\"twicon\"><i class=\"fa fa-twitter\"></i></span> \n");
      out.write("            </a>\n");
      out.write("        </section>\n");
      out.write("        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("        <script src=\"js/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- REVOLUTION JS FILES -->\n");
      out.write("        <script src=\"revolution/js/jquery.themepunch.revolution.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- Custom Js -->\n");
      out.write("        <script src=\"js/custom.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- Custom Js -->\n");
      out.write("        <script src=\"js/myscript.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/client.js\"></script>\n");
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
