package org.auctionsystem.AuctionSystem.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import java.time.LocalDateTime;


@Data
public class Auction {

    @Id
    private String id;
    private Product product;
    private String sellerId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private AuctionStatus status;
    private double currentHighestBid;
    private User winner;

}
