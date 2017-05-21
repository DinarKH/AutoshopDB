package FigureDB;

public class Car {
    private int carId;
    private int clientId;
    private int carNumber;
    private String model;
    private String color;
    private int yearIssue;
    
    public Car(int clientId, int carNumber, String model, String color, int yearIssue) {
        this.clientId = clientId;
        this.carNumber = carNumber;
        this.model = model;
        this.color = color;
        this.yearIssue = yearIssue;
    }
    
    public Car() {    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearIssue() {
        return yearIssue;
    }

    public void setYearIssue(int yearIssue) {
        this.yearIssue = yearIssue;
    }   
}
