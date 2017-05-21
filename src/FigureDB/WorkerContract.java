package FigureDB;

public class WorkerContract {  
    private int workerContractId;
    private int contractId;
    private int workerId;
    
    public WorkerContract(int contractId, int workerId) {
        this.contractId = contractId;
        this.workerId = workerId;
    }

    public WorkerContract() {    }

    public int getWorkerContractId() {
        return workerContractId;
    }

    public void setWorkerContractId(int workerContractId) {
        this.workerContractId = workerContractId;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }
}
