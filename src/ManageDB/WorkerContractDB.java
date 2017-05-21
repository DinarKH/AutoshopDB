package ManageDB;

import Connection.ManageConnect;
import FigureDB.WorkerContract;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class WorkerContractDB {
    private ManageConnect mConnect;

    public WorkerContractDB(ManageConnect mConnect) {
        this.mConnect = mConnect;
    }
    
    public void add(WorkerContract workerContract) throws SQLException {
        try {
            Formatter f = new Formatter();
            f.format("insert into worker_contract values ( nextval('seq_worker_contract'), %d, %d);",
                    workerContract.getContractId(), workerContract.getWorkerId());
            mConnect.executeUpdate(f.toString());
        } catch (SQLException ex) {
            throw ex;
        }
    }
    
     public void update(WorkerContract workerContract) throws SQLException {
        try {
            Formatter f = new Formatter();
            f.format("update worker_contract set contract_id = %d, "
                    + "worker_id = %d where  worker_contract_id =  %d;",
                    workerContract.getContractId(), workerContract.getWorkerId(), 
                    workerContract.getWorkerContractId());

            mConnect.executeUpdate(f.toString());
        } catch (SQLException ex) {
            throw ex;
        }
    }
     
     public void delete(WorkerContract workerContract) throws SQLException {
        try {
            String query = "delete from worker_contract where worker_contract_id = " + workerContract.getWorkerContractId();
            mConnect.executeUpdate(query);
        } catch (SQLException ex) {
            throw ex;
        }
    }
     
     public List<WorkerContract> all() throws SQLException {
        List<WorkerContract> entities;        
        try {
            entities = new ArrayList<>();

            ResultSet rs = mConnect.executeQuery("select * from worker_contract");
            while (rs.next()) {
                WorkerContract entity = new WorkerContract();
                entity.setWorkerContractId(rs.getInt("worker_contract_id"));
                entity.setContractId(rs.getInt("contract_id"));
                entity.setWorkerId(rs.getInt("worker_id"));
                entities.add(entity);
            }
        } catch (SQLException ex) {
            throw ex;
        }
        return entities;
    }

    public WorkerContract one(int id) throws SQLException {
        WorkerContract entity = new WorkerContract();
        try {
            Formatter f = new Formatter();
            f.format("select * from worker_contract where worker_contract_id = '%d'", id);
            ResultSet rs = mConnect.executeQuery(f.toString());            
            rs.next();
            entity.setWorkerContractId(rs.getInt("worker_contract_id"));
            entity.setContractId(rs.getInt("contract_id"));
            entity.setWorkerId(rs.getInt("worker_id"));            
        } catch (SQLException ex) {
            throw ex;
        }
        return entity;
    }
}
