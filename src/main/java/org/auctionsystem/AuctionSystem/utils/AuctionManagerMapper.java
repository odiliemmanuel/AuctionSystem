package org.auctionsystem.AuctionSystem.utils;


import org.auctionsystem.AuctionSystem.data.models.Auction;
import org.auctionsystem.AuctionSystem.data.models.Product;
import org.auctionsystem.AuctionSystem.dtos.requests.CreateAuctionRequest;

public class AuctionManagerMapper {


    public static Auction mapCreateNewAuctionRequestToAuction(CreateAuctionRequest createAuctionRequest){
        Auction auction = new Auction();
        Product product = new Product();

        if(!createAuctionRequest.getProduct().getName().matches("^[A-Za-z]+$")){
            throw new
        }
        product.setName(createAuctionRequest.getProduct().getName());
        product.setDescription(createAuctionRequest.getProduct().getDescription());
        product.setPrice(createAuctionRequest.getProduct().getPrice());
        product.setImage(createAuctionRequest.getProduct().getImage());

        auction.setProduct(product);
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