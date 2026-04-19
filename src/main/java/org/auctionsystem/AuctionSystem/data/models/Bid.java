package org.auctionsystem.AuctionSystem.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
public class Bid {

    @Id
    private String id;
    private double amount;
    private LocalDateTime timeCreated;
    private BidStatus bidStatus;
}
