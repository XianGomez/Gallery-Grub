package edu.teamrocket.gallerygrub.order;

import java.util.Map;
import edu.teamrocket.gallerygrub.items.Product;

public interface Comanda {


    public void addItem(String item, double prize);

    public void display();

    Map<String, Product> getPedido();

    public void addItem(String item, double precio, String extra);
}
