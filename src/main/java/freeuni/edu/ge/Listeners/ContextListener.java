package freeuni.edu.ge.Listeners;

import freeuni.edu.ge.DAO.InMemory.*;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListener implements ServletContextListener {


    String PASSWORD = "datoiesimon1!";
    String USER = "root";
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        AdministratorDao adminDAO = new InMemoryAdmnDao();
        PatientDAOInterface patientDao = new PatientDAO();
        DoctorDAO doctorDAO = new DoctorsDAO();

        servletContextEvent.getServletContext().setAttribute("PatientsBase", patientDao);
        servletContextEvent.getServletContext().setAttribute("AdministratorDAO",adminDAO);
        servletContextEvent.getServletContext().setAttribute("DoctorsDAO", doctorDAO);

        BasicDataSource dataSource = new BasicDataSource();

//        dataSource.setUrl("jdbc:mysql://localhost:3306/medWeb");
//        dataSource.setUsername(USER);
//        dataSource.setPassword(PASSWORD);

        dataSource.setUrl("jdbc:mysql://localhost:3306/medweb");
        dataSource.setUsername("root");
        dataSource.setPassword("3.1415");

        servletContextEvent.getServletContext().setAttribute("dataSource",dataSource);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}