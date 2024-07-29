public class Product implements ProductCatalog {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("Product: " + name + ", Price: " + price);
    }
}
