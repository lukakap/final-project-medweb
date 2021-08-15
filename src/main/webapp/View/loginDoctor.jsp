<%@ page import="freeuni.edu.ge.DAO.InMemoryAdmnDao" %>
<%@ page import="java.util.Map" %>
<%@ page import="freeuni.edu.ge.DAO.AdministratorDao" %>
<%@ page import="freeuni.edu.ge.Models.Doctor" %>
<%@ page import="freeuni.edu.ge.Models.Visit" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="freeuni.edu.ge.DAO.DoctorCommands" %>
<%@ page import="freeuni.edu.ge.DAO.DoctorCommandsSQL" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 7/24/2021
  Time: 2:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String id = (String) request.getAttribute("id");
    DoctorCommands dao = (DoctorCommandsSQL) request.getSession().getAttribute("DAO");
    Doctor doctor = dao.getDoctorById(id);
%>
<html>
<head>
    <title>Welcome <%=doctor.getName()%>!</title>
</head>
<body>

    <h2>Personal Information</h2>
    <p>
        <label>Name: </label> <%=doctor.getName() %> <br>
        <label>Surname: </label> <%=doctor.getSurname() %> <br>
        <label>Speciality: </label> <%=doctor.getSpeciality() %> <br>
        <label>Qualification: </label> <%=doctor.getQualification() %> <br>
        <label>Experience: </label> <%=doctor.getYearExperience() %> <br>
        <label>City: </label> <%=doctor.getCity() %> <br>
        <label>ID: </label> <%=doctor.getID() %> <br>
        <label>Mobile: </label> <%=doctor.getMobileNumber() %> <br>

        <form action="/loginDc" method="post">
                    <input type="submit" value = "Log Out" name = "logOut">
                    <input type="submit" value = "Edit Info" name = "edit">
                </form>
    </p>

<%--
    <% if(!doctor.getVisits.isEmpty()) { %>
        <ul>
            <% List<Visits> visits = doctor.getVisits();
                for(Visit visit : visits) { %>
                    <li><%=visit.getPatientName()%> - doctor.getName()</li>
            <%}%>
        </ul>
    <%}%>
--%>

    <h2>Your Online Visits:</h2>

    <ol>


        <%
            Iterator<Visit> it = dao.getDoctorVisitsIterator(doctor.getID(),"Online");
            while(it.hasNext()) {
                Visit visit = it.next();
        %>
        <form action = "/chat?tp=d" method = post>
            <li>Doctor: <%=dao.getDoctorById(visit.getDoctorId()).getName() %> <br> Reason: <%=visit.getReason() %> <br> Date: <%=visit.getDate() %>
                <input type = "hidden" name = "doctor" id = "doctor" value = <%=visit.getDoctorId()%> >
                <input type = "hidden" name = "patient" id = "patient" value = <%=visit.getPatientId()%> >
                <input type = "submit" value = "Open Chat">
            </li> </br>
        </form>
        <%}%>
    </ol>



</body>
</html>
