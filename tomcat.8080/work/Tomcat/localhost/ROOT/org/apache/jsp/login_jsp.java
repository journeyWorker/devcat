/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.20
 * Generated at: 2015-03-15 13:13:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/./commons/_head.jspf", Long.valueOf(1426425077000L));
    _jspx_dependants.put("/./commons/_nav.jspf", Long.valueOf(1426425209000L));
    _jspx_dependants.put("/./commons/_footer.jspf", Long.valueOf(1426424353000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

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

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>ChocoBanana</title>\n");
      out.write("<link href=\"commons/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"commons/css/jumbotron.css\" rel=\"stylesheet\">");
      out.write("\n");
      out.write(" <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("<link\n");
      out.write("\thref='http://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600'\n");
      out.write("\trel='stylesheet' type='text/css'>\n");
      out.write("<link\n");
      out.write("\thref=\"//netdna.bootstrapcdn.com/font-awesome/3.1.1/css/font-awesome.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\n");
      out.write("\t\t\t\tdata-target=\".navbar-collapse\">\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\n");
      out.write("\t\t\t\t\tclass=\"icon-bar\"></span>\n");
      out.write("\t\t\t</button>\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"/index.jsp\">Choco Banana</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"navbar-collapse collapse\">\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t<li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"/login.jsp\">Login</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"/signup.jsp\">Sign Up</a></li>\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\"\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\">Dropdown <b class=\"caret\"></b></a>\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/mypage.jsp\">Mypage</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Another action</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Something else here</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown-header\">Nav header</li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Separated link</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">One more separated link</a></li>\n");
      out.write("\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<form class=\"navbar-form navbar-right\">\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" placeholder=\"Email\" class=\"form-control\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<input type=\"password\" placeholder=\"Password\" class=\"form-control\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<button type=\"submit\" class=\"btn btn-success\">Sign in</button>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!--/.navbar-collapse -->\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\t \n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"testbox\">\n");
      out.write("\t\t\t<h1>Login</h1>\n");
      out.write("\n");
      out.write("\t\t\t<form action=\"/form.jsp\" method=\"get\">\n");
      out.write("\n");
      out.write("\t\t\t\t<label id=\"icon\" for=\"userId\"><i class=\"icon-user\"></i></label> <input\n");
      out.write("\t\t\t\t\ttype=\"text\" name=\"userId\" id=\"userId\" placeholder=\"Id\" required />\n");
      out.write("\t\t\t\t<label id=\"icon\" for=\"email\"><i class=\"icon-envelope \"></i></label>\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"email\" id=\"email\" placeholder=\"E-mail\"\n");
      out.write("\t\t\t\t\trequired /> <label id=\"icon\" for=\"Password\"><i\n");
      out.write("\t\t\t\t\tclass=\"icon-shield\"></i></label> <input type=\"password\" name=\"password\"\n");
      out.write("\t\t\t\t\tid=\"password\" placeholder=\"Password\" required /> <input\n");
      out.write("\t\t\t\t\ttype=\"submit\" class=\"button\" value=\"Submit\"></input>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t");
      out.write("\n");
      out.write("<!-- Bootstrap core JavaScript\n");
      out.write("    ================================================== -->\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("   <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("    <script src=\"commons/js/bootstrap.min.js\"></script>\n");
      out.write("    ");
      out.write("\n");
      out.write("</body>\n");
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
