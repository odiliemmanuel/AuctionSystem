package org.auctionsystem.AuctionSystem.event;

public class NewBidderEvent extends Event{

    private String bidId;
    private double amount;

    public NewBidderEvent(String bidId, double amount){
        super("EVT-" + bidId, "NEW_BID");
        this.bidId = bidId;
        this.amount = amount;
    }
}
