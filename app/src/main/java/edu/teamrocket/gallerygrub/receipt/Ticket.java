package edu.teamrocket.gallerygrub.receipt;

import edu.teamrocket.gallerygrub.extras.Extra;

public interface Ticket {

    public Double total();
    public void print();
    public void setChain(Extra chain);
}
