public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1200);
        Product product2 = new Product("Smartphone", 800);
        Product product3 = new Product("Headphones", 150);
        Product product4 = new Product("Charger", 20);
        Product product5 = new Product("Tablet", 600);

        Category electronics = new Category("Electronics");
        Category computers = new Category("Computers");
        Category accessories = new Category("Accessories");

        computers.addComponent(product1);
        computers.addComponent(product5);
        accessories.addComponent(product3);
        accessories.addComponent(product4);

        electronics.addComponent(computers);
        electronics.addComponent(accessories);
        electronics.addComponent(product2);

        electronics.print();
    }

}
