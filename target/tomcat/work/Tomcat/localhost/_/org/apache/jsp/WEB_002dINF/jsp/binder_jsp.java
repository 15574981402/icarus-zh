/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-03-16 09:18:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class binder_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>绑定用户</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.css\">\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("<script src=\"http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write(".roundbtn {\r\n");
      out.write("\twidth: 40px;\r\n");
      out.write("\theight: 40px;\r\n");
      out.write("\tmargin-top: 25px;\r\n");
      out.write("\t-webkit-border-radius: 20px;\r\n");
      out.write("\t-moz-border-radius: 20px;\r\n");
      out.write("\t-ms-border-radius: 20px;\r\n");
      out.write("\t-o-border-radius: 20px;\r\n");
      out.write("\tborder-radius: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media all and (min-width: 800px) {\r\n");
      out.write("\t#nav {\r\n");
      out.write("\t\twidth: 300px;\r\n");
      out.write("\t\tfloat: left;\r\n");
      out.write("\t\tmargin-right: 20px;\r\n");
      out.write("\t}\r\n");
      out.write("\t#grid {\r\n");
      out.write("\t\twidth: 450px;\r\n");
      out.write("\t\tfloat: left;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media all and (max-width: 799px) {\r\n");
      out.write("\t#nav {\r\n");
      out.write("\t\twidth: 100%;\r\n");
      out.write("\t}\r\n");
      out.write("\t#grid {\r\n");
      out.write("\t\twidth: 100%;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div data-role=\"page\" id=\"home\" data-theme=\"a\">\r\n");
      out.write("\t\t<div data-role=\"header\" data-theme=\"b\">\r\n");
      out.write("\t\t\t<h1>用户绑定</h1>\r\n");
      out.write("\t\t\t<a href=\"#about\" data-rel=\"dialog\" data-role=\"button\" class=\"roundbtn ui-btn ui-shadow ui-btn-up-c ui-btn-left\">\r\n");
      out.write("\t\t\t\t<div style=\"margin-top: 10px; font-size: 15px\">关于</div>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div data-role=\"content\">\r\n");
      out.write("\t\t\t<form action=\"/binder.action\" method=\"post\">\r\n");
      out.write("\t\t\t<font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</font><br/>\r\n");
      out.write("                               用户名:<input type=\"text\" name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" required placeholder=\"请输入用户名\" />\r\n");
      out.write("                               密码 :<input type=\"text\" name=\"password\"\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.password}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" required placeholder=\"请输入密码\" />\r\n");
      out.write("\t\t\t<input  type=\"submit\" value=\"绑定\"/>\r\n");
      out.write("\t\t\t<a href=\"/register.action\" data-role=\"button\">注册</a>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div data-role=\"footer\" data-position=\"fixed\" data-theme=\"b\">\r\n");
      out.write("\t\t\t<h4>底部</h4>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- About Dialog -->\r\n");
      out.write("\t<div id=\"about\" data-role=\"page\">\r\n");
      out.write("\t\t<div data-role=\"header\">\r\n");
      out.write("\t\t\t<h1>关于</h1>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}