package edu.teamrocket.gallerygrub.order;

import java.util.HashMap;
import java.util.Map;

public class Order implements Comanda{

    private Map<String,Double> pedido = new HashMap<>();

    public void addItem(String item, double prize) {
        pedido.put(item, prize);
    }

    public void display() {
        System.out.println("\n\t --- ORDER ---");
        pedido.entrySet().stream()
                         .forEach(entry -> System.out.println(
                            "\t"+ entry.getKey() + "...."+entry.getValue() + "$"));
        
    }

    @Override
    public Map<String, Double> getPedido() {
        return this.pedido;
    }

}
