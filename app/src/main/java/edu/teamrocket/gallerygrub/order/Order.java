package edu.teamrocket.gallerygrub.order;

import java.util.HashMap;
import java.util.Map;
import edu.teamrocket.gallerygrub.items.Item;
import edu.teamrocket.gallerygrub.items.Product;

public class Order implements Comanda{

    private Map<String, Product> pedido = new HashMap<>();
    

    public void addItem(String item, double prize) {
        pedido.put(item, new Item(item, prize));
    }

    public void addItem(String item, double prize, String extra) {
        pedido.put(item + " w/ " + extra, new Item(item, prize, extra));
        
    }

    public void display() {
        System.out.println("\n\t --- ORDER ---");
        pedido.entrySet().stream()
                         .forEach(entry -> System.out.println(
                            "\t"+ entry.getValue().toString()));
        
    }

    @Override
    public Map<String, Product> getPedido() {
        return this.pedido;
    }

}
