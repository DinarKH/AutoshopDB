package FigureDB;
    
import java.sql.Date;

public class Contract {
    int contractId;
    private int clientId;
    private Date dateIn;
    private Date dateOut;
    
    public Contract(int clientId, Date dateIn, Date dateOut) {
        this.clientId = clientId;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
    }
    
    public Contract() {}

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public Date getDateIn() {
        return dateIn;
    }

    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }

    public Date getDateOut() {
        return dateOut;
    }

    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }

    @Override
    public String toString() {
        return this.contractId+"";
    }    
}
