package Model;

public abstract class InformaticProduct extends Product {
    private String producer;

    //Constructor
    public InformaticProduct(String name, double price, int stock, String producer) {
        super(name, price, stock);
        this.producer = producer;
    }
    //Getters
    public String getProducer() {
        return producer;
    }
}
