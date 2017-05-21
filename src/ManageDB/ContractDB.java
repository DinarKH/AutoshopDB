package ManageDB;

import Connection.ManageConnect;
import FigureDB.Contract;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class ContractDB {
     private ManageConnect mConnect;
     List<Contract> entities = null;
     
     public ContractDB(ManageConnect mConnect) {
        this.mConnect = mConnect;
    }
     
     public void add(Contract contract) throws SQLException {
        try {
            Formatter f = new Formatter();
            f.format("insert into contract values ( nextval('seq_contract'), %d,'"+
                    contract.getDateIn()+ "','"+contract.getDateOut()+ "')" ,
                    contract.getClientId());
            
            mConnect.executeUpdate(f.toString());

        } catch (SQLException ex) {
            throw ex;
        }
    }
     
    public void update(Contract contract) throws SQLException {
        try {
            Formatter f = new Formatter();
            f.format("update contract set  client_id = %d, date_in = '" + contract.getDateIn()+"',"
                    + "date_out='" + contract.getDateOut()+"' where contract_id = %d;",
                    contract.getClientId(),contract.getContractId());
            mConnect.executeUpdate(f.toString());
        } catch (SQLException ex) {
            throw ex;
        }
    }
    
     public void delete(Contract contract) throws SQLException {
        try {
            String query = "delete from mark where id_mark = " + contract.getContractId();
            mConnect.executeUpdate(query);
        } catch (SQLException ex) {
            throw ex;
        }
    }  

    public List<Contract> all() {
        try {
            entities = new ArrayList<>();
            ResultSet rs = mConnect.executeQuery("select * from contract");
            while (rs.next()) {
                Contract entity = new Contract();
                entity.setContractId(rs.getInt("contract_id"));
                entity.setClientId(rs.getInt("client_id"));
                entity.setDateIn(rs.getDate("date_in"));
                entity.setDateOut(rs.getDate("date_out"));
                entities.add(entity);
            }
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        return entities;
    }
}
