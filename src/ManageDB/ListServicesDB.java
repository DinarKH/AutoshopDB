package ManageDB;

import Connection.ManageConnect;
import FigureDB.ListServices;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class ListServicesDB {
     private ManageConnect mConnect;

    public ListServicesDB(ManageConnect mConnect) {
        this.mConnect = mConnect;
    }
    
    public void add(ListServices listServices) throws SQLException {
        try {
            Formatter f = new Formatter();
            f.format("insert into list_services values ( nextval('seq_list_services'), %d, %d);",
                    listServices.getContractId(), listServices.getServiceId());
            mConnect.executeUpdate(f.toString());
        } catch (SQLException ex) {
            throw ex;
        }
    }
    
     public void update(ListServices listServices) throws SQLException {
        try {
            Formatter f = new Formatter();
            f.format("update list_services set contract_id = %d, service_id = %d where  list_services_id =  %d;",
                    listServices.getContractId(), listServices.getServiceId(), listServices.getListServicesId());

            mConnect.executeUpdate(f.toString());
        } catch (SQLException ex) {
            throw ex;
        }
    }
     
     public void delete(ListServices listServices) throws SQLException {
        try {
            String query = "delete from list_services where list_services_id = " + listServices.getListServicesId();
            mConnect.executeUpdate(query);
        } catch (SQLException ex) {
            throw ex;
        }
    }
     
     public List<ListServices> all() throws SQLException {
        List<ListServices> entities;        
        try {
            entities = new ArrayList<>();

            ResultSet rs = mConnect.executeQuery("select * from list_services");
            while (rs.next()) {
                ListServices entity = new ListServices();
                entity.setListServicesId(rs.getInt("list_services_id"));
                entity.setContractId(rs.getInt("contract_id"));
                entity.setServiceId(rs.getInt("service_id"));
                entities.add(entity);
            }
        } catch (SQLException ex) {
            throw ex;
        }
        return entities;
    }

    public ListServices one(int id) throws SQLException {
        ListServices entity = new ListServices();
        try {
            Formatter f = new Formatter();
            f.format("select * from list_services where list_services_id = '%d'", id);
            ResultSet rs = mConnect.executeQuery(f.toString());            
            rs.next();
            entity.setListServicesId(rs.getInt("list_services_id"));
            entity.setContractId(rs.getInt("contract_id"));
            entity.setServiceId(rs.getInt("service_id"));            
        } catch (SQLException ex) {
            throw ex;
        }
        return entity;
    }
}
