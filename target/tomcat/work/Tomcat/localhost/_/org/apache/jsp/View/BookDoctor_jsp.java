/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-08-15 10:00:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.View;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import freeuni.edu.ge.Models.Doctor;
import javax.print.Doc;
import java.util.List;
import freeuni.edu.ge.DAO.InMemory.DoctorDAO;
import freeuni.edu.ge.Models.Patient;
import freeuni.edu.ge.DAO.InMemory.AdministratorDao;
import java.util.ArrayList;

public final class BookDoctor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Book New Visit</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <h1>Book Your Visit</h1>\r\n");
      out.write("\r\n");
      out.write("    ");
 if(request.getAttribute("doctors") == null) {
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <p>Select your option from the drop-down list.</p>\r\n");
      out.write("    <form action=\"/bookDC\" method=\"post\">\r\n");
      out.write("        <label for=\"specialty\">Choose a department:</label>\r\n");
      out.write("        <select name=\"specialty\" id=\"specialty\">\r\n");
      out.write("            ");
 for (Doctor.DoctorSpecialities specialty : Doctor.DoctorSpecialities.values()) {
      out.write("\r\n");
      out.write("                <option value=");
      out.print(specialty);
      out.write('>');
      out.write(' ');
      out.print(specialty);
      out.write("</option>\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("        </select>\r\n");
      out.write("\r\n");
      out.write("        <br><br>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"degree\">Choose a degree:</label>\r\n");
      out.write("        <select name=\"degree\" id=\"degree\">\r\n");
      out.write("            ");
 for (Doctor.Doctor_Qualifications degree : Doctor.Doctor_Qualifications.values()) {
      out.write("\r\n");
      out.write("            <option value=");
      out.print(degree);
      out.write('>');
      out.write(' ');
      out.print(degree);
      out.write("</option>\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("        </select>\r\n");
      out.write("        <br><br>\r\n");
      out.write("        <input type=\"submit\" value=\"Submit\" name=\"filter\">\r\n");
      out.write("        <p>Click the \"Submit\" button to filter doctors and get your options.</p>\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("    ");
} else {
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <p>Select doctor from the drop-down list.</p>\r\n");
      out.write("\r\n");
      out.write("        <label>Choose a department: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${specialty}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</label> <br><br>\r\n");
      out.write("        <label>Choose a degree: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${degree}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</label> <br><br>\r\n");
      out.write("\r\n");
      out.write("    ");

        List<Doctor> doctors = (ArrayList<Doctor>) request.getAttribute("doctors");
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
 if(!doctors.isEmpty()) {
      out.write("\r\n");
      out.write("    <form action=\"/bookDC\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("        <br><br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <table bgcolor=\"lightgray\" border=\"5\" width=\"60%\" cellpadding=\"5\" cellspacing=\"0.5\" color=\"blue\" >\r\n");
      out.write("            <tr>\r\n");
      out.write("\r\n");
      out.write("                <th colspan =\"3\" bgcolor=\"#999999\"><br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div align=\"Center\" > <font face=\"verdana\" size=\"5\" color=\"white\"> Choose Time </font>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </th>\r\n");
      out.write("            </tr>\r\n");
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <select name=\"doctor\" >\r\n");
      out.write("                        ");
 for (Doctor doctor : doctors) {
      out.write("\r\n");
      out.write("                        <option value=");
      out.print(doctor.getID());
      out.write('>');
      out.write(' ');
      out.print(doctor.getName());
      out.write(' ');
      out.print(doctor.getSurname());
      out.write("</option>\r\n");
      out.write("                        ");
}
      out.write("\r\n");
      out.write("                    </select>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <input type=\"radio\" id=\"10:00 - 11:00\" name=\"date\" value=\"10:00 - 11:00\">\r\n");
      out.write("                    <label for=\"10:00 - 11:00\">10:00 - 11:00</label><br>\r\n");
      out.write("\r\n");
      out.write("                    <input type=\"radio\" id=\"11:00 - 12:00\" name=\"date\" value=\"11:00 - 12:00\">\r\n");
      out.write("                    <label for=\"11:00 - 12:00\">11:00 - 12:00</label><br>\r\n");
      out.write("\r\n");
      out.write("                    <input type=\"radio\" id=\"12:00 - 13:00\" name=\"date\" value=\"12:00 - 13:00\">\r\n");
      out.write("                    <label for=\"12:00 - 13:00\">12:00 - 13:00</label><br>\r\n");
      out.write("\r\n");
      out.write("                    <input type=\"radio\" id=\"13:00 - 14:00\" name=\"date\" value=\"13:00 - 14:00\">\r\n");
      out.write("                    <label for=\"13:00 - 14:00\">13:00 - 14:00</label><br>\r\n");
      out.write("\r\n");
      out.write("                    <input type=\"radio\" id=\"14:00 - 15:00\" name=\"date\" value=\"14:00 - 15:00\">\r\n");
      out.write("                    <label for=\"14:00 - 15:00\">14:00 - 15:00</label><br>\r\n");
      out.write("\r\n");
      out.write("                    <input type=\"radio\" id=\"15:00 - 16:00\" name=\"date\" value=\"15:00 - 16:00\">\r\n");
      out.write("                    <label for=\"15:00 - 16:00\">15:00 - 16:00</label><br>\r\n");
      out.write("\r\n");
      out.write("                    <input type=\"radio\" id=\"16:00 - 17:00\" name=\"date\" value=\"16:00 - 17:00\">\r\n");
      out.write("                    <label for=\"16:00 - 17:00\">16:00 - 17:00</label><br>\r\n");
      out.write("\r\n");
      out.write("                    <input type=\"radio\" id=\"17:00 - 18:00\" name=\"date\" value=\"17:00 - 18:00\">\r\n");
      out.write("                    <label for=\"17:00 - 18:00\">17:00 - 18:00</label><br>\r\n");
      out.write("\r\n");
      out.write("                    <input type=\"radio\" id=\"18:00 - 19:00\" name=\"date\" value=\"18:00 - 19:00\">\r\n");
      out.write("                    <label for=\"18:00 - 19:00\">18:00 - 19:00</label><br>\r\n");
      out.write("\r\n");
      out.write("                    <input type=\"radio\" id=\"19:00 - 20:00\" name=\"date\" value=\"19:00 - 20:00\">\r\n");
      out.write("                    <label for=\"19:00 - 20:00\">19:00 - 20:00</label><br>\r\n");
      out.write("\r\n");
      out.write("            </tr>\r\n");
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("\r\n");
      out.write("        <tr>  <tr>\r\n");
      out.write("        <br> <br>\r\n");
      out.write("\r\n");
      out.write("        <p>Click the \"Submit\" button to choose a doctors.</p> <br><br>\r\n");
      out.write("\r\n");
      out.write("        <input type=\"submit\" value=\"Submit\" name=\"choose\">\r\n");
      out.write("\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("    ");
} else {
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <label>Doctors with current qualification and specialty does not exist.</label> <br><br>\r\n");
      out.write("    ");
}
      out.write("\r\n");
      out.write("    ");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <a href=\"/loginPT\"> Back To Profile </a>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
