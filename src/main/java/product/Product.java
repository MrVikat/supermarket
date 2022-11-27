package product;

public class Product {

    public String name;
    public float quantity;
    private String description;
    public float price;

    public Product(String name, float quantity, String description, float price) {
        this.name = name;
        this.quantity = quantity;
        this.description = description;
        this.price = price;
    }

    public String toString() {
        return "Name: " + name +" Quantity: "+ quantity + " Description: " + description + " Price: €" + price;
    }


}
