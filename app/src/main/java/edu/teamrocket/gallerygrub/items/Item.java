package edu.teamrocket.gallerygrub.items;

public class Item implements Product {
    private String name;
    private Double price;
    private String extra;

    public Item(String item, double precio) {
        this.name = item;
        this.price = precio;
    }
 
    public Item(String item, double precio, String extra) {
        this.name = item;
        this.price = precio;
        this.extra = extra;

    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getExtra() {
        return extra;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        if (extra != null && !extra.isEmpty()) {
            double extraPrice = RetailPrice.getPrice(extra);
            return this.getName() + " w/ " + extra + "...." + this.getPrice() + "$ + " + extraPrice + "$";
        }
        return this.getName() + "...." + this.getPrice() + "$";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Item item = (Item) obj;
        return name != null && name.equals(item.name) &&
               price != null && price.equals(item.price) &&
               ((extra == null && item.extra == null) || (extra != null && extra.equals(item.extra)));
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (extra != null ? extra.hashCode() : 0);
        return result;
    }
    
}
