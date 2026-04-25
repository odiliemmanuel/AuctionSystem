package org.auctionsystem.AuctionSystem.dtos.responses;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.auctionsystem.AuctionSystem.data.models.AuctionStatus;
import org.auctionsystem.AuctionSystem.data.models.Bid;
import org.auctionsystem.AuctionSystem.data.models.Product;
import org.auctionsystem.AuctionSystem.data.models.User;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Data
public class CreateAuctionResponse {

    private String id;
    private Product product;
    private int numberOfBidders;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime startTime;

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalTime endTIme;

}
