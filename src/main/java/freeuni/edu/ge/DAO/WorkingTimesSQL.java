package freeuni.edu.ge.DAO;

import freeuni.edu.ge.Models.Doctor;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.persistence.Basic;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;

public class WorkingTimesSQL implements WorkingTimesDAOInterface{

    private static final int NEX_DAYS = 8;
    private static final int DAY_GRAPHIC= 8;

    private final BasicDataSource source;

    public static void main(String [] args) throws SQLException {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/medweb");
        dataSource.setUsername("root");
        dataSource.setPassword("3.1415");
        WorkingTimesSQL sql = new WorkingTimesSQL(dataSource);
        Doctor doc = new Doctor("LUKA", "KAP", "60001151487");
        sql.addDoctor(doc);
    }

    public WorkingTimesSQL (BasicDataSource source){
        this.source = source;
    }

    @Override
    public void addDoctor(Doctor doctor) throws SQLException {
        source.restart();
        try{
            Connection connection = source.getConnection();
            LocalDateTime localDateTime = LocalDateTime.now();
            for(int i =0; i<NEX_DAYS; i++) {
                PreparedStatement statement = connection.prepareStatement("insert into DoctorWorkTimes(ID, Dates, Ten, Eleven, " +
                        "Twelve, Thirteen, Fourteen, Fifteen, Sixteen, Seventeen)" +
                        "values()");
                statement.setString(1, doctor.getID());
                Date now = new Date(localDateTime.getYear(), localDateTime.getMonthValue()-1, localDateTime.getDayOfMonth()+1);
                statement.setDate(2, (java.sql.Date) now);
                for(int j =0; j< DAY_GRAPHIC; j++) {
                    statement.setBoolean(2+i, false);
                }
                statement.executeUpdate();
            }
        }catch(SQLException exception){
            exception.printStackTrace();
        }
    }

    @Override
    public void updateBase() {

    }

    @Override
    public void reserveDoctor(Doctor doctor, Date date, Time time) {

    }
}