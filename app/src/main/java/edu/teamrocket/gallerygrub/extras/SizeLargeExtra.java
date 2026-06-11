package edu.teamrocket.gallerygrub.extras;

import edu.teamrocket.gallerygrub.order.Comanda;
import edu.teamrocket.gallerygrub.items.RetailPrice;

public class SizeLargeExtra extends Extra {
    
    @Override
    public Double calculate(Comanda comanda) {
        Double largePrice = RetailPrice.getPrice("large");
        long largeCount = comanda.getPedido().entrySet().stream()
            .filter(entry -> entry.getKey().contains("large"))
            .count();
        
        Double total = largePrice * largeCount;
        
        if (nextExtra != null) {
            return total + nextExtra.calculate(comanda);
        }
        return total;
    }
}
