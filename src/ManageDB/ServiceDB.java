package ManageDB;

import Connection.ManageConnect;
import FigureDB.Service;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class ServiceDB {
    private ManageConnect mConnect;

    public ServiceDB(ManageConnect mConnect) {
        this.mConnect = mConnect;
    }
    
    public void add(Service service) throws SQLException {
        try {
            Formatter f = new Formatter();
            f.format("insert into service values ( nextval('seq_service'), %d, %d, '%s');",
                    service.getPrice(), service.getRuntime(), service.getName());
            mConnect.executeUpdate(f.toString());
        } catch (SQLException ex) {
            throw ex;
        }
    }
    
     public void update(Service service) throws SQLException {
        try {
            Formatter f = new Formatter();
            f.format("update service set price = %d, runtime = %d, name = '%s' where  service_id =  %d;",
                    service.getPrice(), service.getRuntime(), service.getName(), service.getServiceId());

            mConnect.executeUpdate(f.toString());
        } catch (SQLException ex) {
            throw ex;
        }
    }
     
     public void delete(Service service) throws SQLException {
        try {
            String query = "delete from service where service_id = " + service.getServiceId();
            mConnect.executeUpdate(query);
        } catch (SQLException ex) {
            throw ex;
        }
    }
     
     public List<Service> all() throws SQLException {
        List<Service> entities;        
        try {
            entities = new ArrayList<>();

            ResultSet rs = mConnect.executeQuery("select * from service");
            while (rs.next()) {
                Service entity = new Service();
                entity.setServiceId(rs.getInt("service_id"));
                entity.setPrice(rs.getInt("price"));
                entity.setRuntime(rs.getInt("runtime"));
                entity.setName(rs.getString("name"));
                entities.add(entity);
            }
        } catch (SQLException ex) {
            throw ex;
        }
        return entities;
    }

    public Service one(int id) throws SQLException {
        Service entity = new Service();
        try {
            Formatter f = new Formatter();
            f.format("select * from service where service_id = '%d'", id);
            ResultSet rs = mConnect.executeQuery(f.toString());
            
            rs.next();
            entity.setServiceId(rs.getInt("service_id"));
                entity.setPrice(rs.getInt("price"));
                entity.setRuntime(rs.getInt("runtime"));
                entity.setName(rs.getString("name"));
            
        } catch (SQLException ex) {
            throw ex;
        }
        return entity;
    }
}
