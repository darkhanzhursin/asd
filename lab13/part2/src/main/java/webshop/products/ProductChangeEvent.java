package webshop.products;

public class ProductChangeEvent {
    private int productNumber;
    private int quantitySold;

    public ProductChangeEvent(int productNumber, int quantitySold) {
        this.productNumber = productNumber;
        this.quantitySold = quantitySold;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public int getQuantitySold() {
        return quantitySold;
    }
}
