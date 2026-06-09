package edu.teamrocket.gallerygrub.items;

public class Item implements Product {
    private String name;
    private Double price;
    private String extra;

    public Item(String item, double precio) {
        this.name = item;
        this.price = precio;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.getName() + "...." + this.getPrice()+"$";
    }
    
}
