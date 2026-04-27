package org.auctionsystem.AuctionSystem.dtos.requests;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;


import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
public class CreateAuctionRequest {

    private String product;
    private String sellerId;

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime startTime;

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime endTIme;

}