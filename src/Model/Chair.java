package Model;


public class Chair extends Product{
    private Boolean wheels;

    // Constructor
    public Chair(String name, double price, Integer stock, Boolean wheels) {
        super(name, price, stock);
        this.wheels = wheels;
    }
    //ToString
    @Override
    public String toString() {
        return "Silla [ID: " + getId() + ", Name: " + name + ", Price: " + getPrice() +
                ", Stock: " + stock + ", Have wheels?: " + (wheels ? "Yes" : "No") + "]";
    }

}
