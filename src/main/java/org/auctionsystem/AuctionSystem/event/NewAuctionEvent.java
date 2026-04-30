package org.auctionsystem.AuctionSystem.event;

public class NewAuctionEvent extends Event{

    private String auctionId;

    public NewAuctionEvent(String auctionId){
        super("EVT-" + auctionId, "NEW_AUCTION");
        this.auctionId = auctionId;
    }
}
