package org.auctionsystem.AuctionSystem.utils;


import org.auctionsystem.AuctionSystem.data.models.Auction;
import org.auctionsystem.AuctionSystem.data.models.Product;
import org.auctionsystem.AuctionSystem.dtos.requests.CreateAuctionRequest;

public class AuctionManagerMapper {


    public static Auction mapCreateNewAuctionRequestToAuction(CreateAuctionRequest createAuctionRequest){
        Auction auction = new Auction();
        Product product = new Product();

        product.setName(createAuctionRequest.getProduct().getName());
        product.setDescription(createAuctionRequest.getProduct().getDescription());

        auction.setProduct();
    }
}


//private Product product;
//private String sellerId;
//
//@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
//private LocalDateTime startTime;
//
//@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
//private LocalDateTime endTIme;