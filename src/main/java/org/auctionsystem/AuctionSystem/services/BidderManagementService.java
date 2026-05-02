package org.auctionsystem.AuctionSystem.services;

import org.auctionsystem.AuctionSystem.data.models.Auction;
import org.auctionsystem.AuctionSystem.data.models.AuctionStatus;
import org.auctionsystem.AuctionSystem.data.models.User;
import org.auctionsystem.AuctionSystem.data.repositories.AuctionRepository;
import org.auctionsystem.AuctionSystem.data.repositories.BidderRepository;
import org.auctionsystem.AuctionSystem.data.repositories.UserRepository;
import org.auctionsystem.AuctionSystem.dtos.requests.NewBidderRequest;
import org.auctionsystem.AuctionSystem.dtos.responses.NewBidderResponse;
import org.auctionsystem.AuctionSystem.exceptions.AuctionDoesNotExistException;
import org.auctionsystem.AuctionSystem.exceptions.Messages;
import org.springframework.stereotype.Service;

@Service
public class BidderManagementService {

    private final BidderRepository bidderRepository;
    private final AuctionRepository auctionRepository;
    private final UserRepository userRepository;

    public BidderManagementService(BidderRepository bidderRepository,  AuctionRepository auctionRepository, UserRepository userRepository) {
        this.bidderRepository = bidderRepository;
        this.auctionRepository = auctionRepository;
        this.userRepository = userRepository;
    }


    public NewBidderResponse bidAuction(NewBidderRequest bidderRequest) {
        User user = userRepository.findById(bidderRequest.getUserId()).get();
        Auction auction = auctionRepository.findById(bidderRequest.getAuctionId()).get();

        if(auction == null || auction.getStatus() == AuctionStatus.CLOSED) {
            throw new AuctionDoesNotExistException(Messages.AUCTION_DOES_NOT_EXIST_EXCEPTION);
        }
        if(user == null){
            throw new AuctionDoesNotExistException(Messages.USER_DOES_NOT_EXIST_EXCEPTION);
        }
        if(auction.getProduct().getPrice() > Integer.parseInt(bidderRequest.getAmount())){

        }
    }
}
//private String userId;
//private String auctionId;
//private String amount;