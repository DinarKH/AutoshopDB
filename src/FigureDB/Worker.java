package FigureDB;

public class Worker {
    private int workerId;
    private String secondName;
    private String firstName;
    private int passportData;
    
    public Worker(String secondName, String firstName, int passportData) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.passportData = passportData;
    }

    public Worker() {
    }

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getPassportData() {
        return passportData;
    }

    public void setPassportData(int passportData) {
        this.passportData = passportData;
    }
    
    @Override
    public String toString() {
        return secondName + " " + firstName;
    }
}
