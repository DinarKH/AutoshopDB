package ManageDB;

import Connection.ManageConnect;
import FigureDB.Car;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class CarDB {
     private ManageConnect mConnect;

    public CarDB(ManageConnect mConnect) {
        this.mConnect = mConnect;
    }
    
     public void add(Car car) throws SQLException {
        try {
            Formatter f = new Formatter();
            f.format("insert into car values ( nextval('seq_car'), %d,%d, '%s','%s', %d);",
                    car.getClientId(), car.getCarNumber(), car.getModel(),car.getColor(),
                    car.getYearIssue());
            mConnect.executeUpdate(f.toString());
        } catch (SQLException ex) {
            throw ex;
        }
    }
    
     public void update(Car car) throws SQLException {
        try {
            Formatter f = new Formatter();
            f.format("update car set client_id = %d, car_number = %d, model = '%s', "
                    + "color='%s',year_issue=%d where  car_id =  %d;",car.getClientId(), 
                    car.getCarNumber(), car.getModel(), car.getColor(),car.getYearIssue(),
                    car.getCarId());
            mConnect.executeUpdate(f.toString());
        } catch (SQLException ex) {
            throw ex;
        }
    }
     
     public void delete(Car car) throws SQLException {
        try {
            String query = "delete from car where car_id = " + car.getCarId();
            mConnect.executeUpdate(query);
        } catch (SQLException ex) {
            throw ex;
        }
    }
     
     public List<Car> all() throws SQLException {
        List<Car> entities;        
        try {
            entities = new ArrayList<>();

            ResultSet rs = mConnect.executeQuery("select * from car");
            while (rs.next()) {
                Car entity = new Car();
                entity.setCarId(rs.getInt("car_id"));
                entity.setClientId(rs.getInt("client_id"));
                entity.setCarNumber(rs.getInt("car_number"));
                entity.setModel(rs.getString("model"));
                entity.setColor(rs.getString("color"));
                entity.setYearIssue(rs.getInt("year_issue"));
                entities.add(entity);
            }
        } catch (SQLException ex) {
            throw ex;
        }
        return entities;
    }

    public Car one(int id) throws SQLException {
        Car entity = new Car();
        try {
            Formatter f = new Formatter();
            f.format("select * from car where car_id = '%d'", id);
            ResultSet rs = mConnect.executeQuery(f.toString());            
            rs.next();
            entity.setCarId(rs.getInt("car_id"));
            entity.setClientId(rs.getInt("client_id"));
            entity.setCarNumber(rs.getInt("car_number"));
            entity.setModel(rs.getString("model"));
            entity.setColor(rs.getString("color"));
            entity.setYearIssue(rs.getInt("year_issue"));            
        } catch (SQLException ex) {
            throw ex;
        }
        return entity;
    }
}
