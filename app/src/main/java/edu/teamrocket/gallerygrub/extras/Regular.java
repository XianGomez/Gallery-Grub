package edu.teamrocket.gallerygrub.extras;

import edu.teamrocket.gallerygrub.order.Comanda;

public class Regular extends Extra {

    @Override
    public Double calculate(Comanda comanda) {
        Double total = comanda.getPedido().entrySet().stream()
            .mapToDouble(entry -> entry.getValue().getPrice())
            .sum();
        
        if (nextExtra != null) {
            return nextExtra.calculate(comanda);
        }
        return total;
    }
}
