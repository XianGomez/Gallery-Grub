package edu.teamrocket.gallerygrub.receipt;

import edu.teamrocket.gallerygrub.order.Comanda;

public class Receipt implements Ticket {
    private Double total;
    private Comanda comanda;

    public Receipt(Comanda comanda) {
        this.comanda = comanda;
    }

    public Comanda getOrder() {
        return comanda;
    }

    public Double total() {
    this.total = comanda.getPedido().entrySet().stream()
        .mapToDouble(entry -> entry.getValue()) 
        .sum();

        return (Double) total;
    }

    public void print() {
        comanda.display();
        System.out.println("\tTOTAL --------> " + this.total() + "$");
    }

}
