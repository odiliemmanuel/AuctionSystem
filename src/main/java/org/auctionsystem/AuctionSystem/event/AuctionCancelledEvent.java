package org.auctionsystem.AuctionSystem.event;

public class AuctionCancelledEvent extends Event{


    public AuctionCancelledEvent(String auctionId) {
        super("EVT-" + auctionId, "CANCEL_AUCTION");
        thr
    }
}
