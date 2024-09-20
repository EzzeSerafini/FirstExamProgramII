package Model;

public class Notebook extends InformaticProduct {
    //private String producer;

    //constructor
    private Integer ram ;
    public Notebook(String name, double price, int stock, String producer, int ram) {
        super(name, price, stock, producer);
        this.ram = ram;
    }

    //ToString
    @Override
    public String toString() {
        return "Notebook [ID: " + getId() + ", name: " + name + ", Price: " + getPrice() + "" +
                ", Stock: " + stock + " + Producer: " + getProducer() + " + Ram: " + ram + "]";
    }
}