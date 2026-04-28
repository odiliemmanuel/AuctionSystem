package org.auctionsystem.AuctionSystem.utils;


import org.auctionsystem.AuctionSystem.data.models.Auction;
import org.auctionsystem.AuctionSystem.data.models.Product;
import org.auctionsystem.AuctionSystem.dtos.requests.CreateAuctionRequest;
import org.auctionsystem.AuctionSystem.exceptions.InvalidInputException;
import org.auctionsystem.AuctionSystem.exceptions.LowPriceOfProductException;
import org.auctionsystem.AuctionSystem.exceptions.Messages;

public class AuctionManagerMapper {


    public static Auction mapCreateNewAuctionRequestToAuction(CreateAuctionRequest createAuctionRequest){
        Auction auction = new Auction();
        Product product = new Product();

        if(!createAuctionRequest.getProduct().getName().matches("^[A-Za-z]+$")){
            throw new InvalidInputException(Messages.INVALID_INPUT_EXCEPTION);
        }
        else{
            product.setName(createAuctionRequest.getProduct().getName());
        }


        if(!createAuctionRequest.getProduct().getDescription().matches("^[A-Za-z]+$")){
            throw new InvalidInputException(Messages.INVALID_INPUT_EXCEPTION);
        }
        else{
            product.setDescription(createAuctionRequest.getProduct().getDescription());
        }

        if(createAuctionRequest.getProduct().getPrice().matches("[0-9]+")){
            throw new InvalidInputException(Messages.INVALID_INPUT_EXCEPTION);

            if(Integer.parseInt(createAuctionRequest.getProduct().getPrice()) < 10000){
                throw new LowPriceOfProductException(Messages.LOW_PRICE_OF_PRODUCT_EXCEPTION);
            }

        }

        else{
            product.setPrice(createAuctionRequest.getProduct().getPrice());
        }

        product.setImage(createAuctionRequest.getProduct().getImage());


        auction.setProduct(product);
        auction.setSellerId(createAuctionRequest.getSellerId());
        auction.setStartTime(createAuctionRequest.getStartTime());
        auction.setEndTime(createAuctionRequest.getEndTime());

        return auction;
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