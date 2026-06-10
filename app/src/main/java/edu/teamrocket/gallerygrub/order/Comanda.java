package edu.teamrocket.gallerygrub.order;

import java.util.Map;

public interface Comanda {


    public void addItem(String item, double prize);

    public void display();
    
    Map<String, Double> getPedido();
}
