package edu.teamrocket.gallerygrub.items;

public class Product {
    private String item;
    private double precio;

    public Product(String item, double precio) {
        this.item = item;
        this.precio = precio;
    }

    public String getItem() {
        return item;
    }

    public double getPrecio() {
        return precio;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
