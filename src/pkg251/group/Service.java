

package pkg251.group;

public class Service {
    String name;
    double price;
    Worker doneBy;

    public Service(String name, double price, Worker doneBy) {
        this.name = name;
        this.price = price;
        this.doneBy = doneBy;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Worker getDoneBy() {
        return doneBy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDoneBy(Worker doneBy) {
        this.doneBy = doneBy;
    }

  //  @Override
    public String toString(Service service ) {
        return "Service{" + "name=" + name + ", price=" + price + ", doneBy=" + doneBy.getName() + '}';
    }
    
}