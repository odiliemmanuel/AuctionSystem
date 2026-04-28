package org.auctionsystem.AuctionSystem.controllers;

import org.auctionsystem.AuctionSystem.dtos.requests.CreateAuctionRequest;
import org.auctionsystem.AuctionSystem.exceptions.ProductAlreadyAuctionedBeforeBySellerException;
import org.auctionsystem.AuctionSystem.services.AuctionManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seller")
public class AuctionManagementController {

    @Autowired
    AuctionManagementService auctionManagementService;


    @PostMapping("/create/new/auction")
    public ResponseEntity<?> createNewAuction(CreateAuctionRequest createAuctionRequest){
        try{
            return ResponseEntity.status(HttpStatus.CREATED).body(auctionManagementService.organizeNewOption(createAuctionRequest));
        }
        catch(ProductAlreadyAuctionedBeforeBySellerException error){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }
}
