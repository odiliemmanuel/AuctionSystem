package org.auctionsystem.AuctionSystem.services;

import org.auctionsystem.AuctionSystem.data.repositories.BidderRepository;
import org.auctionsystem.AuctionSystem.dtos.requests.NewBidderRequest;
import org.auctionsystem.AuctionSystem.dtos.responses.NewBidderResponse;
import org.springframework.stereotype.Service;

@Service
public class BidderManagementService {

    private BidderRepository bidderRepository;

    public BidderManagementService(BidderRepository bidderRepository) {
        this.bidderRepository = bidderRepository;
    }


    public NewBidderResponse bidAuction(NewBidderRequest bidderRequest) {

    }
}
