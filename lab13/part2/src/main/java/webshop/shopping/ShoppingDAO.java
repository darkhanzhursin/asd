package webshop.shopping;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ShoppingDAO {
    private Map<Integer, ShoppingCart> shoppingCarts = new HashMap<Integer, ShoppingCart>();

    public void save(ShoppingCart shoppingCart){
        shoppingCarts.put(shoppingCart.getCartId(), shoppingCart);
    }

    public ShoppingCart find(int cartId){
        return shoppingCarts.get(cartId);
    }
}
