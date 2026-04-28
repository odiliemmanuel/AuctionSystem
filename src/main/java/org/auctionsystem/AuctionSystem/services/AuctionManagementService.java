package org.auctionsystem.AuctionSystem.services;

import org.auctionsystem.AuctionSystem.data.models.Auction;
import org.auctionsystem.AuctionSystem.data.repositories.AuctionRepository;
import org.auctionsystem.AuctionSystem.data.repositories.ProductRepository;
import org.auctionsystem.AuctionSystem.data.repositories.UserRepository;
import org.auctionsystem.AuctionSystem.dtos.requests.CreateAuctionRequest;
import org.auctionsystem.AuctionSystem.dtos.responses.CreateAuctionResponse;
import org.auctionsystem.AuctionSystem.exceptions.Messages;
import org.auctionsystem.AuctionSystem.exceptions.ProductAlreadyAuctionedBeforeBySellerException;
import org.auctionsystem.AuctionSystem.utils.AuctionManagerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuctionManagementService{

    @Autowired
    private AuctionRepository auctionRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private UserRepository userRepository;


    public  CreateAuctionResponse organizeNewOption(CreateAuctionRequest createAuctionRequest){
        Auction auction = AuctionManagerMapper.mapCreateNewAuctionRequestToAuction(createAuctionRequest);

        if(productRepository.findById(auction.getProduct().getId()).isPresent() && userRepository.findById(auction.getSellerId()).isPresent()){
            throw new ProductAlreadyAuctionedBeforeBySellerException(Messages.PRODUCT_ALREADY_AUCTIONED_BEFORE_BY_SELLER_EXCEPTION);
        }

    }
}
