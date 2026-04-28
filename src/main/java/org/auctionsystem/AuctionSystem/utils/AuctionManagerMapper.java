package org.auctionsystem.AuctionSystem.utils;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.auctionsystem.AuctionSystem.data.models.Auction;
import org.auctionsystem.AuctionSystem.data.models.Product;
import org.auctionsystem.AuctionSystem.data.repositories.ProductRepository;
import org.auctionsystem.AuctionSystem.dtos.requests.CreateAuctionRequest;
import org.auctionsystem.AuctionSystem.dtos.responses.CreateAuctionResponse;
import org.auctionsystem.AuctionSystem.exceptions.InvalidInputException;
import org.auctionsystem.AuctionSystem.exceptions.LowPriceOfProductException;
import org.auctionsystem.AuctionSystem.exceptions.Messages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
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

        if(!createAuctionRequest.getProduct().getPrice().matches("[0-9]+")){
            throw new InvalidInputException(Messages.INVALID_INPUT_EXCEPTION);


        }
        if(Integer.parseInt(createAuctionRequest.getProduct().getPrice()) < 10000){
            throw new LowPriceOfProductException(Messages.LOW_PRICE_OF_PRODUCT_EXCEPTION);
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


    public static CreateAuctionResponse mapCreateAuctionResponseToAuction(Auction auction){
        CreateAuctionResponse createAuctionResponse = new CreateAuctionResponse();

        createAuctionResponse.setId(auction.getId());
        createAuctionResponse.setProduct(auction.getProduct());
        createAuctionResponse.setNumberOfBidders(0);
        createAuctionResponse.setStartTime(auction.getStartTime());
        createAuctionResponse.setEndTime(auction.getEndTime());

        return createAuctionResponse;
    }
}






