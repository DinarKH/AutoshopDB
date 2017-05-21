package FigureDB;

public class Client {
    private int clientId;
    private String secondName;
    private String firstName;
    private int passportData;
    
    public Client(String secondName, String firstName, int passportData) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.passportData = passportData;
    }

    public Client() {  }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
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
        return secondName+" "+firstName;
    }
}
