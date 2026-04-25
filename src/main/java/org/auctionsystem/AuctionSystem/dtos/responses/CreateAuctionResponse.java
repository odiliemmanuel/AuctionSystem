package org.auctionsystem.AuctionSystem.dtos.responses;

import lombok.Data;
import org.auctionsystem.AuctionSystem.data.models.AuctionStatus;
import org.auctionsystem.AuctionSystem.data.models.Product;
import org.auctionsystem.AuctionSystem.data.models.User;

import java.time.LocalDateTime;

@Data
public class CreateAuctionResponse {

    private String id;
    private Product product;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private AuctionStatus status;

}
