package edu.teamrocket.gallerygrub.order;

import java.util.HashMap;
import java.util.Map;

public class Comanda {
    protected Map<String,Double> pedido = new HashMap<>();

    Comanda() {};

    public void addItem(String item, double prize) {
        pedido.put(item, prize);
    }

    public void display() {
        System.out.println("\n\t --- ORDER ---");
        pedido.entrySet().stream()
                         .forEach(entry -> System.out.println(
                            "\t"+ entry.getKey() + "...."+entry.getValue()));
        
    }

}
