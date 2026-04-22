package org.auctionsystem.AuctionSystem.event;

public class NewUserEvent extends Event{


    private String userId;

    public NewUserEvent(String userId){
        super("EVT-" + userId, "NEW_USER");
        this.userId = userId;
    }
}
