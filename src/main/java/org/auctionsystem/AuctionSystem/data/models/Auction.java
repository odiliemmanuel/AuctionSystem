package org.auctionsystem.AuctionSystem.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
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
