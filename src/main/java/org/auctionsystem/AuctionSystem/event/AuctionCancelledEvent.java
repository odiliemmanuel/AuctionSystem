package org.auctionsystem.AuctionSystem.event;

public class AuctionCancelledEvent extends Event{

    private String auctionId;

    public AuctionCancelledEvent(String auctionId) {
        super("EVT-" + auctionId, "CANCEL_AUCTION");
        this.auctionId = auctionId;
    }
}
