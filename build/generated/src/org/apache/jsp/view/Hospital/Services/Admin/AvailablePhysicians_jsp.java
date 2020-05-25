package org.apache.jsp.view.Hospital.Services.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AvailablePhysicians_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Available Physicians</title>\n");
      out.write("        <style>\n");
      out.write("            /* Base for label styling */\n");
      out.write("            [type=\"checkbox\"]:not(:checked),\n");
      out.write("            [type=\"checkbox\"]:checked {\n");
      out.write("                position: absolute;\n");
      out.write("                left: -9999px;\n");
      out.write("            }\n");
      out.write("            [type=\"checkbox\"]:not(:checked) + label,\n");
      out.write("            [type=\"checkbox\"]:checked + label {\n");
      out.write("                position: relative;\n");
      out.write("                padding-left: 1.95em;\n");
      out.write("                margin-left: -34px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* checkbox aspect */\n");
      out.write("            [type=\"checkbox\"]:not(:checked) + label:before,\n");
      out.write("            [type=\"checkbox\"]:checked + label:before {\n");
      out.write("                content: '';\n");
      out.write("                position: absolute;\n");
      out.write("                left: 0; top: 0;\n");
      out.write("                width: 1.25em; height: 1.25em;\n");
      out.write("                border: 2px solid #ccc;\n");
      out.write("                background: #fff;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                box-shadow: inset 0 1px 3px rgba(0,0,0,.1);\n");
      out.write("            }\n");
      out.write("            /* checked mark aspect */\n");
      out.write("            [type=\"checkbox\"]:not(:checked) + label:after,\n");
      out.write("            [type=\"checkbox\"]:checked + label:after {\n");
      out.write("                content: '\\2713\\0020';\n");
      out.write("                position: absolute;\n");
      out.write("                top: .15em; left: .22em;\n");
      out.write("                font-size: 1.3em;\n");
      out.write("                line-height: 0.8;\n");
      out.write("                color: #09ad7e;\n");
      out.write("                transition: all .2s;\n");
      out.write("                font-family: 'Lucida Sans Unicode', 'Arial Unicode MS', Arial;\n");
      out.write("            }\n");
      out.write("            /* checked mark aspect changes */\n");
      out.write("            [type=\"checkbox\"]:not(:checked) + label:after {\n");
      out.write("                opacity: 0;\n");
      out.write("                transform: scale(0);\n");
      out.write("            }\n");
      out.write("            [type=\"checkbox\"]:checked + label:after {\n");
      out.write("                opacity: 1;\n");
      out.write("                transform: scale(1);\n");
      out.write("            }\n");
      out.write("            /* disabled checkbox */\n");
      out.write("            [type=\"checkbox\"]:disabled:not(:checked) + label:before,\n");
      out.write("            [type=\"checkbox\"]:disabled:checked + label:before {\n");
      out.write("                box-shadow: none;\n");
      out.write("                border-color: #bbb;\n");
      out.write("                background-color: #ddd;\n");
      out.write("            }\n");
      out.write("            [type=\"checkbox\"]:disabled:checked + label:after {\n");
      out.write("                color: #999;\n");
      out.write("            }\n");
      out.write("            [type=\"checkbox\"]:disabled + label {\n");
      out.write("                color: #aaa;\n");
      out.write("            }\n");
      out.write("            /* accessibility */\n");
      out.write("            [type=\"checkbox\"]:checked:focus + label:before,\n");
      out.write("            [type=\"checkbox\"]:not(:checked):focus + label:before {\n");
      out.write("                border: 2px dotted blue;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* hover style just for information */\n");
      out.write("            label:hover:before {\n");
      out.write("                border: 2px solid #4778d9!important;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            /* Useless styles, just for demo design */\n");
      out.write("\n");
      out.write("            body {\n");
      out.write("                font-family: \"Open sans\", \"Segoe UI\", \"Segoe WP\", Helvetica, Arial, sans-serif;\n");
      out.write("                color: #777;\n");
      out.write("            }\n");
      out.write("            h1, h2 {\n");
      out.write("                margin-bottom: .25em;\n");
      out.write("                font-weight: normal;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            h2 {\n");
      out.write("                margin: .25em 0 2em;\n");
      out.write("                color: #aaa;\n");
      out.write("            }\n");
      out.write("            form {\n");
      out.write("                width: 7em;\n");
      out.write("                margin: 0 auto;\n");
      out.write("            }\n");
      out.write("            .txtcenter {\n");
      out.write("                margin-top: 4em;\n");
      out.write("                font-size: .9em;\n");
      out.write("                text-align: center;\n");
      out.write("                color: #aaa;\n");
      out.write("            }\n");
      out.write("            .copy {\n");
      out.write("                margin-top: 2em; \n");
      out.write("            }\n");
      out.write("            .copy a {\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #4778d9;\n");
      out.write("            }\n");
      out.write("            .bu1\n");
      out.write("            {\n");
      out.write("                margin-left: 529px;\n");
      out.write("                padding: 10px;\n");
      out.write("                font-size: 15px;\n");
      out.write("                border: 1px solid brown;\n");
      out.write("            }\n");
      out.write("            .bu2\n");
      out.write("            {\n");
      out.write("                margin-left: 62px;\n");
      out.write("                margin-top: -50px;\n");
      out.write("                padding: 10px;\n");
      out.write("                font-size: 15px;\n");
      out.write("                border: 1px solid brown;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Choose Available Physicians</h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form>\n");
      out.write("            <p>\n");
      out.write("                <input type=\"checkbox\" id=\"test1\" value=\"Eyes Doctor\"/>\n");
      out.write("                <label for=\"test1\">Eyes Doctor</label>\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                <input type=\"checkbox\" id=\"test2\" value=\"Analysis Doctor\"/>\n");
      out.write("                <label for=\"test2\">Analysis Doctor</label>\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                <input type=\"checkbox\" id=\"test3\" value=\"Rumor Doctor\"/>\n");
      out.write("                <label for=\"test3\">Rumor Doctor</label>\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                <input type=\"checkbox\" id=\"test4\" value=\"Pharmacist\"/>\n");
      out.write("                <label for=\"test4\">Pharmacist</label>\n");
      out.write("            </p>\n");
      out.write("            <div id=\"inv\"></div>\n");
      out.write("        </form>\n");
      out.write("        <button class=\"bu1\" onclick=\"Done()\">Done</button>\n");
      out.write("        <button class=\"bu2\"><a>Main Page</a></button>\n");
      out.write("        <script src=\"js/Available.js\"></script>\n");
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
