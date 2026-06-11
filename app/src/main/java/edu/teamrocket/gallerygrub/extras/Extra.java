package edu.teamrocket.gallerygrub.extras;

import edu.teamrocket.gallerygrub.order.Comanda;

public abstract class Extra {
    protected Extra nextExtra;

    public void setNextExtra(Extra nextExtra) {
        this.nextExtra = nextExtra;
    }

    public abstract Double calculate(Comanda comanda);
}
