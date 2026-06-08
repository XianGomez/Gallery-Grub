package edu.teamrocket.gallerygrub.items;

import java.util.HashMap;
import java.util.Map;

public class RetailPrice {
    static final Map<String, Double> prices = new HashMap<>();

    RetailPrice() {};

    public static void init_prices() {
        prices.put("cheese", 0.25d);
        prices.put("sauce", 0.50d);
        prices.put("medium", 0.25d);
        prices.put("large", 0.50d);
    }

    public static void display() {
        prices.entrySet().stream()
                         .forEach(entry -> System.out.println(
                                        "\t"+ entry.getKey() + "-"+entry.getValue()));
    }
}
