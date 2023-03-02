/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-02-22 06:06:54 UTC
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

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Login Form</title>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"component/login.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\r\n");
      out.write("    <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	");

		String validMsg = (String) session.getAttribute("validMsg");
		String invalidMsg = (String) session.getAttribute("invalidMsg");

		if (validMsg != null) {
	
      out.write("\r\n");
      out.write("	<script>\r\n");
      out.write("		alert(\"Successfully Login...\");\r\n");
      out.write("		window.location.assign(\"dashboard.jsp\");\r\n");
      out.write("	</script>\r\n");
      out.write("	");

		session.removeAttribute("validMsg");
		}
	
      out.write('\r');
      out.write('\n');
      out.write('	');

		if (invalidMsg != null) {
	
      out.write("\r\n");
      out.write("	<script>\r\n");
      out.write("		alert(\"Something went Wrong..!!\");\r\n");
      out.write("		window.location.assign(\"login.jsp\");\r\n");
      out.write("	</script>\r\n");
      out.write("	");

		session.removeAttribute("invalidMsg");
		}
	
      out.write("\r\n");
      out.write("	\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"row px-3\">\r\n");
      out.write("        <div class=\"col-lg-10 col-xl-9 card flex-row mx-auto px-0\">\r\n");
      out.write("            <div class=\"img-left d-none d-md-flex\"></div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"card-body\">\r\n");
      out.write("                <h4 class=\"title text-center mt-4\">\r\n");
      out.write("                    Login\r\n");
      out.write("                </h4>\r\n");
      out.write("                <form class=\"form-box px-3\" action=\"login\" method=\"post\">\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"form-input\">\r\n");
      out.write("                        <span><i class=\"fa fa-envelope-o\"></i></span>\r\n");
      out.write("                        <input type=\"email\" name=\"email\" placeholder=\"Email Address\" tabindex=\"10\" required>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-input\">\r\n");
      out.write("                        <span><i class=\"fa fa-key\"></i></span>\r\n");
      out.write("                        <input type=\"password\" name=\"password\" placeholder=\"Password\" required>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-block text-uppercase\">\r\n");
      out.write("                            Login\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"text-center mb-3\">\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row mb-3\">\r\n");
      out.write("                            <a href=\"index.jsp\" class=\"btn btn-block btn-social btn-facebook\">\r\n");
      out.write("                                Back to Home\r\n");
      out.write("                            </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <hr class=\"my-4\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"text-center mb-2\">\r\n");
      out.write("                        Don't have an account?\r\n");
      out.write("                        <a href=\"register.jsp\" class=\"register-link\">\r\n");
      out.write("                            Register here\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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
