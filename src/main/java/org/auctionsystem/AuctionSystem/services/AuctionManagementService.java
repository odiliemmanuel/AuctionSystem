package org.auctionsystem.AuctionSystem.services;

import org.auctionsystem.AuctionSystem.data.repositories.AuctionRepository;
import org.auctionsystem.AuctionSystem.dtos.requests.CreateAuctionRequest;
import org.auctionsystem.AuctionSystem.dtos.responses.CreateAuctionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuctionManagementService{

    @Autowired
    AuctionRepository auctionRepository;


    public static CreateAuctionResponse organizeNewOption(CreateAuctionRequest createAuctionRequest){

    }
}
