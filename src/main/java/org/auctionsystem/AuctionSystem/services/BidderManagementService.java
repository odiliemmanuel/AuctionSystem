package org.auctionsystem.AuctionSystem.services;

import org.auctionsystem.AuctionSystem.data.models.User;
import org.auctionsystem.AuctionSystem.data.repositories.AuctionRepository;
import org.auctionsystem.AuctionSystem.data.repositories.BidderRepository;
import org.auctionsystem.AuctionSystem.data.repositories.UserRepository;
import org.auctionsystem.AuctionSystem.dtos.requests.NewBidderRequest;
import org.auctionsystem.AuctionSystem.dtos.responses.NewBidderResponse;
import org.springframework.stereotype.Service;

@Service
public class BidderManagementService {

    private BidderRepository bidderRepository;
    private AuctionRepository auctionRepository;
    private UserRepository userRepository;

    public BidderManagementService(BidderRepository bidderRepository,  AuctionRepository auctionRepository, UserRepository userRepository) {
        this.bidderRepository = bidderRepository;
        this.auctionRepository = auctionRepository;
        this.userRepository = userRepository;
    }


    public NewBidderResponse bidAuction(NewBidderRequest bidderRequest) {
        User user

    }
}
