package freeuni.edu.ge.DAO;

import freeuni.edu.ge.Helpers.Hash;
import freeuni.edu.ge.Models.Doctor;

import java.sql.SQLException;

public interface GeneralCommands {
    boolean canDoctorRegister(String name, String surname, String ID) throws SQLException;
    Doctor getDoctorById(String id) throws SQLException;
    void addNewDoctorRegistrationRequest(String name, String surname, String ID) throws SQLException;
    void registrationFinished(Doctor doctor) throws SQLException;

    boolean checkIfItIsAdministrator(String ID, String password, Hash hash);
    boolean checkIfItIsPatient(String ID, String password, Hash hash) throws SQLException;
    boolean checkIfItIsDoctor(String ID, String password, Hash hash) throws SQLException;
}