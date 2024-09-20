package Model;

public class Desk extends Product{
    private Double height;
    private Double width;
    //constructor
    public Desk(String name, double price, Integer stock, double height, double width) {
        super(name, price, stock);
        this.height = height;
        this.width = width;
        this.stock = stock;
        this.price = price;
        this.name = name;
    }
    //ToString
    @Override
    public String toString() {
        return "Desk [ID: " + getId() + ", name: " + name + ", Price: " + getPrice() +
                ", Stock: " + stock + ", Height: " + height + ", Width: " + width + "]";
    }
}
