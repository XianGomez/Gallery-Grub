package edu.teamrocket.gallerygrub.extras;

import edu.teamrocket.gallerygrub.order.Comanda;
import edu.teamrocket.gallerygrub.items.RetailPrice;

public class SauceExtra extends Extra {
    
    @Override
    public Double calculate(Comanda comanda) {
        Double saucePrice = RetailPrice.getPrice("sauce");
        long sauceCount = comanda.getPedido().entrySet().stream()
            .filter(entry -> entry.getKey().contains("sauce"))
            .count();
        
        Double total = saucePrice * sauceCount;
        
        if (nextExtra != null) {
            return total + nextExtra.calculate(comanda);
        }
        return total;
    }
}
