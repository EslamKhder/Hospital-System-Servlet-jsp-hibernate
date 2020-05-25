package org.apache.jsp.view.Hospital.Services.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.hibernate.SessionFactory;
import java.util.List;
import Model.Booking;
import java.util.ArrayList;
import Controller.ClientController;

public final class Pharmecy_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <style>\n");
      out.write("        .myname\n");
      out.write("        {\n");
      out.write("            position: absolute;\n");
      out.write("            background-color: brown;\n");
      out.write("            padding: 10px;\n");
      out.write("            border: 1px solid white;\n");
      out.write("            color: cornsilk;\n");
      out.write("            margin: 20px;\n");
      out.write("            font-size: 25px;\n");
      out.write("            font-family: fantasy;\n");
      out.write("            letter-spacing: 4px;\n");
      out.write("        }\n");
      out.write("        .pharmacy\n");
      out.write("        {\n");
      out.write("            background-color: #c4d3f6;\n");
      out.write("            width: 40%;\n");
      out.write("            height: 292px;\n");
      out.write("            padding: 35px;\n");
      out.write("            position: absolute;\n");
      out.write("            top: 149px;\n");
      out.write("            left: 414px;\n");
      out.write("            border: 1px solid brown;\n");
      out.write("            display: none;\n");
      out.write("        }\n");
      out.write("        .pharmacy label\n");
      out.write("        {\n");
      out.write("            font-size: 20px;\n");
      out.write("            color: brown;\n");
      out.write("        }\n");
      out.write("        .pharmacy textarea\n");
      out.write("        {\n");
      out.write("            margin: 32px 0px;\n");
      out.write("            border: 1px solid brown;\n");
      out.write("            width: 288px;\n");
      out.write("            height: 116px;\n");
      out.write("            resize: none;\n");
      out.write("            font-size: 17px;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        .pharmacy button\n");
      out.write("        {\n");
      out.write("            position: relative;\n");
      out.write("            left: 400px;\n");
      out.write("            font-size: 20px;\n");
      out.write("            border: 1px solid brown;\n");
      out.write("            padding: 5px;\n");
      out.write("            width: 87px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"myname\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.client.getClientproperties().getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("        ");
      Model.Client client = null;
      synchronized (session) {
        client = (Model.Client) _jspx_page_context.getAttribute("client", PageContext.SESSION_SCOPE);
        if (client == null){
          client = new Model.Client();
          _jspx_page_context.setAttribute("client", client, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");

            ClientController cc = new ClientController();
            List<Booking> booking = new ArrayList();
            SessionFactory sessionf = (SessionFactory) application.getAttribute("factory");
            booking = cc.allmyBooking(sessionf, client);
            pageContext.setAttribute("BOOKING", booking);
        
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
      out.write("                            My Reservations\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"table\">\n");
      out.write("\n");
      out.write("                        <div class=\"row header\">\n");
      out.write("                            <div class=\"cell\">\n");
      out.write("                                NAME (Doctor)\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"cell\">\n");
      out.write("                                NAME (Client)\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"cell\">\n");
      out.write("                                Medicine\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"cell\">\n");
      out.write("                                DATE\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"cell\">\n");
      out.write("                                Services\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--===============================================================================================-->\t\n");
      out.write("        <script src=\"vendor/jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"vendor/bootstrap/js/popper.js\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"vendor/select2/select2.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"js/Reserve.js\"></script>\n");
      out.write("        <script src=\"js/script.js\"></script>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${BOOKING}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("book");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <div class=\"row\" id=\"book");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getDoctor().getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                <div class=\"cell\">\n");
          out.write("                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getDoctor().getDoctorproperties().getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"cell\">\n");
          out.write("                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getClient().getClientproperties().getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"cell\">\n");
          out.write("                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getPharmacy().getMedicine()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"cell\">\n");
          out.write("                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getDate()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"cell\" >\n");
          out.write("                                    <button onclick=\"display1(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getClient().getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(")\">Accept</button>\n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"pharmacy\" id=\"ph");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getClient().getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                    <label>Medicine : </label>\n");
          out.write("                                    <textarea disabled>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getPharmacy().getMedicine()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</textarea>\n");
          out.write("                                    <button onclick=\" display2(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getClient().getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(")\">OK</button>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
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
