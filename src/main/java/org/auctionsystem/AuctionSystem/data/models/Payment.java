package org.auctionsystem.AuctionSystem.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Payment {

    @Id
    private String id;
    private double amount;
    private PaymentStatus paymentStatus;
}
