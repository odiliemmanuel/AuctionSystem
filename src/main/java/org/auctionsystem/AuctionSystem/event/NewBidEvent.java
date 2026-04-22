package org.auctionsystem.AuctionSystem.event;

public class NewBidEvent extends Event{

    private String bidId;

    public NewBidEvent(String bidId){
        super("EVT-" + bidId, "NEW_BID");
        this.bidId = bidId;
    }
}
