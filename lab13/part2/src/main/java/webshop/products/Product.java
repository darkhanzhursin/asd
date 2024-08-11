package webshop.products;


public class Product {
    private int productNumber;
    private String name;
    private double price;
	private int quantityAvailable;


	public Product(int productNumber, String name, double price, int quantityAvailable) {
		this.productNumber = productNumber;
		this.name = name;
		this.price = price;
		this.quantityAvailable = quantityAvailable;
	}

	public int getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantityAvailable() {
		return quantityAvailable;
	}

	public void setQuantityAvailable(int quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}

	@Override
	public String toString() {
		return "Product{" +
				"productNumber=" + productNumber +
				", name='" + name + '\'' +
				", price=" + price +
				", quantityAvailable=" + quantityAvailable +
				'}';
	}
}
