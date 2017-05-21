package ManageDB;

import Connection.ManageConnect;
import FigureDB.Client;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class ClientDB {
    private ManageConnect mConnect;

    public ClientDB(ManageConnect mConnect) {
        this.mConnect = mConnect;
    }
    
    public void add(Client client) throws SQLException {
        try {
            Formatter f = new Formatter();
            f.format("insert into client values ( nextval('seq_client'), '%s', '%s', %d);",
                    client.getSecondName(), client.getFirstName(), client.getPassportData());
            mConnect.executeUpdate(f.toString());
        } catch (SQLException ex) {
            throw ex;
        }
    }
    
     public void update(Client client) throws SQLException {
        try {
            Formatter f = new Formatter();
            f.format("update client set second_name = '%s', first_name = '%s', "
                    + "pasport_data = %d where  client_id =  %d;",client.getSecondName(), 
                    client.getFirstName(), client.getPassportData(), client.getClientId());

            mConnect.executeUpdate(f.toString());
        } catch (SQLException ex) {
            throw ex;
        }
    }
     
     public void delete(Client client) throws SQLException {
        try {
            String query = "delete from client where client_id = " + client.getClientId();
            mConnect.executeUpdate(query);
        } catch (SQLException ex) {
            throw ex;
        }
    }
     
     public List<Client> all() throws SQLException {
        List<Client> entities;
        
        try {
            entities = new ArrayList<>();

            ResultSet rs = mConnect.executeQuery("select * from client");
            while (rs.next()) {
                Client entity = new Client();
                entity.setClientId(rs.getInt("client_id"));
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

    public Client one(int id) throws SQLException {
        Client entity = new Client();
        try {
            Formatter f = new Formatter();
            f.format("select * from client where client_id = '%d'", id);
            ResultSet rs = mConnect.executeQuery(f.toString());            
            rs.next();
            entity.setClientId(rs.getInt("client_id"));
            entity.setSecondName(rs.getString("second_name"));
            entity.setFirstName(rs.getString("first_name"));
            entity.setPassportData(rs.getInt("pasport_data"));            
        } catch (SQLException ex) {
            throw ex;
        }
        return entity;
    }
}
