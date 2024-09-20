package Model;

public abstract class Product {
    //Attribute
    private static int idCounter = 1;
    private Integer id;
    String name;
    Double price;
    Integer stock;

    //Constructor
    public Product(String nombre, double price, Integer stock) {
        this.id = idCounter++;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    //Methods
    public abstract String toString();

    public double discount(double percentage) {
        return price - (price * percentage / 100);
    }

    public void updatePrice(double increase) {
        this.price += this.price * increase / 100;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

}
