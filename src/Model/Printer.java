package Model;

public class Printer extends InformaticProduct {
    //private String producer;
    private Integer printingSpeed;
    //Constructor
    public Printer(String nombre, double price, Integer stock, String producer, Integer printingSpeed) {
        super(nombre, price, stock, producer);
        this.printingSpeed = printingSpeed;
    }

    //ToString
    @Override
    public String toString() {

        return "Printer [ID: " + getId() + ", name: " + name + ", Price: " + getPrice() + "" +
                ", Stock: " + stock + " + Producer: " + getProducer() + " + Printing Speed: " + printingSpeed + "]";
    }
}

