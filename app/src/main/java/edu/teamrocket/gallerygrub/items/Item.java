package edu.teamrocket.gallerygrub.items;

public class Item extends Product {

    public Item(String item, double precio) {
        super(item, precio);
    }

    @Override
    public String toString() {
        return this.getItem() + "...." + this.getPrecio()+"$";
    }
    
}
