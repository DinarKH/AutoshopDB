package Querie;

import Connection.ManageConnect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QueryDB {
    private ManageConnect mConnect;

    public QueryDB(ManageConnect mConnect) {
        this.mConnect = mConnect;
    }
    
    public List<Query1> all() throws SQLException {
        List<Query1> entities;
        
        try {
            entities = new ArrayList<>();

            ResultSet rs = mConnect.executeQuery("select Client.Second_name,Client.First_name,car."
                                                  + "Car_number,Model\n" +"from Client,car\n" +
                                                  "where Client.Client_id=Car.Client_id;");
            while (rs.next()) {
                Query1 entity = new Query1();
                entity.setSecond_name(rs.getString("second_name"));
                entity.setFirst_name(rs.getString("first_name"));
                entity.setCar_number(rs.getInt("car_number"));
                entity.setModel(rs.getString("model"));
                entities.add(entity);
            }
        } catch (SQLException ex) {
            throw ex;
        }
        return entities;
    }
}
