package org.auctionsystem.AuctionSystem.dtos.requests;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.time.LocalTime;

@Data
public class CreateAuctionRequest {

    private String product;
    private String sellerId;

    @JsonFormat(pattern = "HH:mm")
    private LocalTime startTime;
    @JsonFormat(pattern = "HH:mm")
    private LocalTime endTime;


}