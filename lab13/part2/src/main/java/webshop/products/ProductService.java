package webshop.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductDAO productDAO ;

    public void addProduct(int productNumber, String name, double price, int quantity){
        productDAO.save(new Product(productNumber, name, price, quantity));
    }

    public Product getProduct(int productNumber){
        return productDAO.find(productNumber);
    }

    public void removeProduct(int productNumber){
        productDAO.remove(productNumber);
    }

    public void subtractProductQuantity(int productNumber, int quantity){
        Product product = productDAO.find(productNumber);
        if (product.getQuantityAvailable() >= quantity)
           product.setQuantityAvailable(product.getQuantityAvailable()- quantity);
        else {
            System.out.println("WARNING, not enough products available: "+ product.getName());
            product.setQuantityAvailable(0);
        }
    }
}
