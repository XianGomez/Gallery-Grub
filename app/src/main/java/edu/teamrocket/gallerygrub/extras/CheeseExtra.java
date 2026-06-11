package edu.teamrocket.gallerygrub.extras;

import edu.teamrocket.gallerygrub.order.Comanda;
import edu.teamrocket.gallerygrub.items.RetailPrice;

public class CheeseExtra extends Extra {
    
    @Override
    public Double calculate(Comanda comanda) {
        Double cheesePrice = RetailPrice.getPrice("cheese");
        long cheeseCount = comanda.getPedido().entrySet().stream()
            .filter(entry -> entry.getKey().contains("cheese"))
            .count();
        
        Double total = cheesePrice * cheeseCount;
        
        if (nextExtra != null) {
            return total + nextExtra.calculate(comanda);
        }
        return total;
    }
}
