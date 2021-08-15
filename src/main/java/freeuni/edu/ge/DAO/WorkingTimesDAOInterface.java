package freeuni.edu.ge.DAO;

import freeuni.edu.ge.Models.Doctor;

import java.sql.SQLException;
import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.Map;

public interface WorkingTimesDAOInterface {
    public  void addDoctor(Doctor doctor) throws SQLException;
    public void updateBase();
    public void reserveDoctor(Doctor doctor, Date date, Time time) throws SQLException;
    public Map<String , Map<Date, List<Time>>> getAllDoctorWorkingTime() throws SQLException;
}
