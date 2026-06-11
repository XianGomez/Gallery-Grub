package edu.teamrocket.gallerygrub.receipt;

import edu.teamrocket.gallerygrub.order.Comanda;
import edu.teamrocket.gallerygrub.extras.Extra;

public class Receipt implements Ticket {
    private Double total;
    private Comanda comanda;
    private Extra chain;

    public Receipt(Comanda comanda) {
        this.comanda = comanda;
    }

    public Comanda getOrder() {
        return comanda;
    }

    @Override
    public void setChain(Extra chain) {
        this.chain = chain;
    }

    @Override
    public Double total() {
        if (chain != null) {
            this.total = chain.calculate(comanda);
        } else {
            this.total = comanda.getPedido().entrySet().stream()
                .mapToDouble(entry -> entry.getValue().getPrice()) 
                .sum();
        }
        return this.total;
    }

    @Override
    public void print() {
        comanda.display();
        System.out.println("\tTOTAL --------> " + this.total() + "$");
    }

}
