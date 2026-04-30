package org.auctionsystem.AuctionSystem.event;

public class NewBidderEvent extends Event{

    private String bidId;

    public NewBidderEvent(String bidId){
        super("EVT-" + bidId, "NEW_BID");
        this.bidId = bidId;
    }
}
