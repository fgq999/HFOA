/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.11.v20150529
 * Generated at: 2018-12-24 02:19:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../../../CSS/easyui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../../../CSS/icon.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../../../CSS/demo.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../../../CSS/color.css\">\r\n");
      out.write("<!-- <script type=\"text/javascript\" src=\"../../../CSS/jquery.min.js\"></script> -->\r\n");
      out.write("<!-- <script type=\"text/javascript\" src=\"../../../CSS/jquery.easyui.min.js\"></script> -->\r\n");
      out.write("<!-- <script type=\"text/javascript\" src=\"../../../CSS/formValidator-4.1.3.js\"></script> -->\r\n");
      out.write("<!-- <script type=\"text/javascript\" src=\"../../../CSS/formValidatorRegex.js\" charset=\"UTF-8\"></script> -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../../../CSS/loginstyle.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../../../CSS/main.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../../../CSS/login.css\">\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/img/entertainImg/favicon.ico\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/CSS/jqueryui/themes/default/easyui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/CSS/jqueryui/themes/icon.css\">\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/CSS/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/CSS/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/CSS/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/CSS/PublicStyle.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/CSS/DataImport.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/CSS/main.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/CSS/UserManage.css\">\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/CSS/jquery.form.js\"></script>\r\n");
      out.write("<title>信息化管理系统-登录</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body {\r\n");
      out.write("\tbackground:\r\n");
      out.write("\t\turl(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/img/entertainImg/login.png);\r\n");
      out.write(" \tbackground-size: cover;\r\n");
      out.write("\tbackground-repeat: no-repeat;\r\n");
      out.write("\tpadding-top: 80px; \r\n");
      out.write("}\r\n");
      out.write(".white {\r\n");
      out.write("  color:white;}\r\n");
      out.write(" \r\n");
      out.write(" .position{\r\n");
      out.write("  position:fixed;\r\n");
      out.write("  left:55%;\r\n");
      out.write("  top:28%;\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write(" .button{\r\n");
      out.write(" position:relative; \r\n");
      out.write(" left:20%;\r\n");
      out.write(" }\r\n");
      out.write(".btnalink {\r\n");
      out.write("\tcursor: hand;\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\twidth: 80px;\r\n");
      out.write("\theight: 29px;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tmargin: 12px 28px 12px auto;\r\n");
      out.write("\tline-height: 22px;\r\n");
      out.write("\tbackground:\r\n");
      out.write("\t\turl('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/img/entertainImg/btnbg.jpg')\r\n");
      out.write("\t\tno-repeat;\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".tittle {\r\n");
      out.write("\twidth: 516px;\r\n");
      out.write("\theight: 55px;\r\n");
      out.write("\tfont: bold 55px/100% \"微软雅黑\", \"Lucida Grande\", \"Lucida Sans\", Helvetica,\r\n");
      out.write("\t\tArial, Sans; /*设置字体*/\r\n");
      out.write("\tcolor: #fff; /*设置文字颜色*/\r\n");
      out.write("\ttext-transform: uppercase;\r\n");
      out.write("\ttext-shadow: black 0 2px 0; /*设置阴影效果*/\r\n");
      out.write("\tmargin: 0 auto; /*设置文字居中显示*/\r\n");
      out.write("\tletter-spacing: 4px; /*增大文字间间距*/\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\tbottom: 100px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t//登录提示方法\r\n");
      out.write("\tfunction loginsubmit() {\r\n");
      out.write("\t\tvar username = document.getElementById(\"username\").value;\r\n");
      out.write("\t\tvar password = document.getElementById(\"pwd\").value;\r\n");
      out.write("\t\tif (username == \"\") {\r\n");
      out.write("\t\t\talert(\"用户名不能为空\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif (password == \"\") {\r\n");
      out.write("\t\t\talert(\"密码不能为空\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t//$(\"#loginform\").submit();\r\n");
      out.write("\t\tvar param = \"username=\" + username + \"&password=\" + password;\r\n");
      out.write("\t\t$.post(\r\n");
      out.write("\t\t\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/login/login\", param, function(result) {\r\n");
      out.write("\t\t\t/* if (result == \"9\") {\r\n");
      out.write("\t\t\t\tlocation.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/view/entertain/firstZ.jsp';\r\n");
      out.write("\t\t\t} \r\n");
      out.write("\t\t\telse if (result == \"2\") {\r\n");
      out.write("\t\t\t\tlocation.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/view/entertain/firstL.jsp';\r\n");
      out.write("\t\t\t} \r\n");
      out.write("\t\t\telse if(result == \"3\"){\r\n");
      out.write("\t\t\t\tlocation.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/view/entertain/firstG.jsp';\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse  if(result == \"0\"){\r\n");
      out.write("\t\t\t\t$.messager.alert('提示信息', '用户名或密码错误！');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse{\r\n");
      out.write("\t\t\t\tlocation.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/view/entertain/first.jsp';\r\n");
      out.write("\t\t\t} */\r\n");
      out.write("\t\t\t if(result == \"0\"){\r\n");
      out.write("\t\t\t\t$.messager.alert('提示信息', '用户名或密码错误！');\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tlocation.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/login/mainPage';\r\n");
      out.write("\t\t\t} \r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//判断是否敲击了Enter键 \r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$(\"#pwd\").keydown(function(event) {\r\n");
      out.write("\t\t\tif (event.keyCode == 13) {\r\n");
      out.write("\t\t\t\tloginsubmit();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t})\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form id=\"loginform\" name=\"loginform\">\r\n");
      out.write("\t\t\t<div class=\"position\">\r\n");
      out.write("\t\t\t\t<table border=\"0\" cellSpacing=\"20\" cellPadding=\"8\">\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"white\">用&nbsp户</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" id=\"username\" name=\"username\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\" background-color:transparent;color:white \" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"white\">密&nbsp码</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"password\" id=\"pwd\" name=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\" background-color:transparent;color:white\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t<!-- \t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tbody> -->\r\n");
      out.write("\t\t\t\t\t\t<tr >\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"button\" colSpan=\"2\" ><input type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\t\t onclick=\"loginsubmit()\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"登&nbsp;&nbsp;录>>\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
