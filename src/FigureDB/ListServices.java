package FigureDB;

public class ListServices {    
    private int listServicesId;
    private int contractId;
    private int serviceId;
    
    public ListServices(int contractId, int serviceId) {
        this.contractId = contractId;
        this.serviceId = serviceId;
    }

    public ListServices() {
    }

    public int getListServicesId() {
        return listServicesId;
    }

    public void setListServicesId(int listServicesId) {
        this.listServicesId = listServicesId;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }   
}
