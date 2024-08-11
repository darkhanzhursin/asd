package webshop.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class ProductChangeListener {
    @Autowired
    ProductService productService;

    @EventListener
    public void onEvent(ProductChangeEvent event) {
        System.out.println("ProductChangeEvent :"+event.getProductNumber()+" with quantity "+ event.getQuantitySold());
        productService.subtractProductQuantity(event.getProductNumber(), event.getQuantitySold());
    }

}
