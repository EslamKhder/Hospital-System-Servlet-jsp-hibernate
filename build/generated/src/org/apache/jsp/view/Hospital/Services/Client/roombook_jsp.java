package org.apache.jsp.view.Hospital.Services.Client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Model.Doctor;
import Controller.DoctorController;
import org.hibernate.SessionFactory;

public final class roombook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Checkup</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"roombook.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.4.1/css/all.css\" integrity=\"sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700\" rel=\"stylesheet\">\n");
      out.write("        <style>\n");
      out.write("            .bu\n");
      out.write("            {\n");
      out.write("                background-color: green;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .bu a\n");
      out.write("            {\n");
      out.write("                color: white;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            .cars\n");
      out.write("            {\n");
      out.write("                width: 279px;\n");
      out.write("                height: 36px;\n");
      out.write("                font-family: monospace;\n");
      out.write("                font-size: 23px;\n");
      out.write("                margin-bottom: 5px;\n");
      out.write("            }\n");
      out.write("            .sub\n");
      out.write("            {\n");
      out.write("                position: relative;\n");
      out.write("                top: 148px;\n");
      out.write("                left: -404px;\n");
      out.write("            }\n");
      out.write("            .left-part, form {\n");
      out.write("                width: 395%;\n");
      out.write("            }\n");
      out.write("            .b1 {\n");
      out.write("                position: absolute;\n");
      out.write("                right: 185px;\n");
      out.write("                top: 264px;\n");
      out.write("                width: 15%;\n");
      out.write("            }\n");
      out.write("            .b2\n");
      out.write("            {\n");
      out.write("                position: absolute;\n");
      out.write("                right: 185px;\n");
      out.write("                top: 322px;\n");
      out.write("                width: 15%;\n");
      out.write("            }\n");
      out.write("            #inv\n");
      out.write("            {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 400px;\n");
      out.write("                right: 426px;\n");
      out.write("                color: white;\n");
      out.write("                font-size: 20px;\n");
      out.write("                font-family: cursive;\n");
      out.write("            }\n");
      out.write("            .myname\n");
      out.write("            {\n");
      out.write("                position: absolute;\n");
      out.write("                background-color: brown;\n");
      out.write("                padding: 10px;\n");
      out.write("                border: 1px solid white;\n");
      out.write("                color: cornsilk;\n");
      out.write("                margin: 20px;\n");
      out.write("                font-size: 25px;\n");
      out.write("                font-family: fantasy;\n");
      out.write("                letter-spacing: 4px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"myname\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.client.getClientproperties().getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("        <div class=\"main-block\">\n");
      out.write("            <div class=\"left-part\">\n");
      out.write("                <i class=\"fas fa-ambulance\"></i>\n");
      out.write("                <i class=\"fas fa-syringe\"></i>\n");
      out.write("                <i class=\"fas fa-stethoscope\"></i>\n");
      out.write("            </div>\n");
      out.write("            ");

                SessionFactory sessionf = (SessionFactory) application.getAttribute("factory");
                DoctorController dc = new DoctorController();
                List<Doctor> doctor = dc.allDoctor(sessionf);
                pageContext.setAttribute("DOCTORS", doctor);
            
      out.write("\n");
      out.write("            <form>\n");
      out.write("                <h1>CHECKUP</h1>\n");
      out.write("                <div class=\"info\">\n");
      out.write("                    <select id=\"spec\" class=\"cars\">\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <div id=\"inv\"></div>\n");
      out.write("            <button class=\"sub\" onclick=\"Booking();\">SUBMIT</button>\n");
      out.write("\n");
      out.write("            <div class=\"bu\">\n");
      out.write("                <button class=\"b1\"><a href=\"../../Main/MainClient.jsp\">GO TO MAIN PAGE</a></button>\n");
      out.write("                <button class=\"b2\">LOG OUT</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"js/Booking.js\"></script>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${DOCTORS}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("doctor");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${doctor.getSpecialty()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${doctor.getSpecialty()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
