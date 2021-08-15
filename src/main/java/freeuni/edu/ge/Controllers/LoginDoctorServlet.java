package freeuni.edu.ge.Controllers;

import freeuni.edu.ge.DAO.InMemory.AdministratorDao;
import freeuni.edu.ge.DAO.Interfaces.DoctorCommands;
import freeuni.edu.ge.DAO.SQLImplementation.DoctorCommandsSQL;
import freeuni.edu.ge.Models.Doctor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class LoginDoctorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        String id = httpServletRequest.getParameter("id");
        httpServletRequest.setAttribute("id", id);
        httpServletRequest.getRequestDispatcher("View/loginDoctor.jsp").forward(httpServletRequest,httpServletResponse);
    }

    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        String id = httpServletRequest.getParameter("id");
        if(httpServletRequest.getParameter("logOut") != null) {
            httpServletResponse.sendRedirect("http://localhost:8080/home");
        } else if(httpServletRequest.getParameter("edit") != null) {
            httpServletRequest.setAttribute("id", id);
            DoctorCommands dao = (DoctorCommandsSQL) httpServletRequest.getSession().getAttribute("DAO");
            Doctor doctor = null;
            try {
                doctor = dao.getDoctorById(id);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            httpServletRequest.setAttribute("doctor", doctor);
            httpServletRequest.getRequestDispatcher("View/editDoctor.jsp").forward(httpServletRequest,httpServletResponse);
        } else {
            try {
                update(httpServletRequest, httpServletResponse, id);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    private void update(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,String id) throws ServletException, IOException, SQLException {
        DoctorCommands dao = (DoctorCommandsSQL) httpServletRequest.getSession().getAttribute("DAO");
        Doctor doctor = dao.getDoctorById(id);
        doctor.setCity(httpServletRequest.getParameter("city"));
        //doctor.setSpeciality(httpServletRequest.getParameter("speciality"));
        doctor.setMobileNumber(httpServletRequest.getParameter("mobile"));
        //doctor.setQualification(httpServletRequest.getParameter("qualification"));
        doctor.setYearExperience(httpServletRequest.getParameter("yearExperience"));
        httpServletRequest.setAttribute("id", id);
        dao.updateDoctor(doctor);
        httpServletRequest.getRequestDispatcher("View/loginDoctor.jsp").forward(httpServletRequest,httpServletResponse);
    }
}