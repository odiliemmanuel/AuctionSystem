package org.auctionsystem.AuctionSystem.event;

public class NewUserEvent extends Event{


    private String postId;

    public NewUserEvent(String postId){
        super("EVT-" + postId, "POST_VIEWED");
        this.postId = postId;
    }
}
