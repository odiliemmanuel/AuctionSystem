package org.auctionsystem.AuctionSystem.event;

public class AuctionCancelledEvent extends Event{


    public AuctionCancelledEvent(String auctionId) {
        super(auctionId);
    }
}
