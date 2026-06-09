package edu.teamrocket.gallerygrub.receipt;

import edu.teamrocket.gallerygrub.order.Order;

public class Receipt implements Ticket {
    private Order order;

    Receipt(Order order) {
        this.order = order;
    }

    @Override
    public void total() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'total'");
    }
}
