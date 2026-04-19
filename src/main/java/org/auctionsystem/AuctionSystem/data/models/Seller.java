package org.auctionsystem.AuctionSystem.data.models;

import lombok.Data;

@Data
public class Seller extends User{

    private Product product;
    private String verificationStatus;
}
