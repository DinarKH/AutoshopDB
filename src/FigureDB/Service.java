package FigureDB;

public class Service {    
    private int serviceId;
    private int price;
    private int runtime;
    private String name;
    
    public Service(int price, int runtime, String name) {
        this.price = price;
        this.runtime = runtime;
        this.name = name;
    }

    public Service() {
    }
    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return this.name+"";
    }
}
