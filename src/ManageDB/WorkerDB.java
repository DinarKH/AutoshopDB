package ManageDB;

import Connection.ManageConnect;
import FigureDB.Worker;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class WorkerDB {
    private ManageConnect mConnect;

    public WorkerDB(ManageConnect mConnect) {
        this.mConnect = mConnect;
    }
    
    public void add(Worker worker) throws SQLException {
        try {
            Formatter f = new Formatter();
            f.format("insert into worker values ( nextval('seq_worker'), '%s', '%s', %d);",
                    worker.getSecondName(), worker.getFirstName(), worker.getPassportData());
            mConnect.executeUpdate(f.toString());
        } catch (SQLException ex) {
            throw ex;
        }
    }
    
     public void update(Worker worker) throws SQLException {
        try {
            Formatter f = new Formatter();
            f.format("update worker set second_name = '%s', first_name = '%s', "
                    + "pasport_data = %d where  worker_id =  %d;", worker.getSecondName(), 
                    worker.getFirstName(), worker.getPassportData(), worker.getWorkerId());
            mConnect.executeUpdate(f.toString());
        } catch (SQLException ex) {
            throw ex;
        }
    }
     
     public void delete(Worker worker) throws SQLException {
        try {
            String query = "delete from worker where worker_id = " + worker.getWorkerId();
            mConnect.executeUpdate(query);
        } catch (SQLException ex) {
            throw ex;
        }
    }
     
     public List<Worker> all() throws SQLException {
        List<Worker> entities;        
        try {
            entities = new ArrayList<>();
            ResultSet rs = mConnect.executeQuery("select * from worker");
            while (rs.next()) {
                Worker entity = new Worker();
                entity.setWorkerId(rs.getInt("worker_id"));
                entity.setSecondName(rs.getString("second_name"));
                entity.setFirstName(rs.getString("first_name"));
                entity.setPassportData(rs.getInt("pasport_data"));
                entities.add(entity);
            }
        } catch (SQLException ex) {
            throw ex;
        }
        return entities;
    }

    public Worker one(int id) throws SQLException {
        Worker entity = new Worker();
        try {
            Formatter f = new Formatter();
            f.format("select * from worker where worker_id = '%d'", id);
            ResultSet rs = mConnect.executeQuery(f.toString());            
            rs.next();
            entity.setWorkerId(rs.getInt("worker_id"));
            entity.setSecondName(rs.getString("second_name"));
            entity.setFirstName(rs.getString("first_name"));
            entity.setPassportData(rs.getInt("pasport_data"));            
        } catch (SQLException ex) {
            throw ex;
        }
        return entity;
    }
}
