package org.auctionsystem.AuctionSystem.controllers;


import org.auctionsystem.AuctionSystem.dtos.requests.NewBidderRequest;
import org.auctionsystem.AuctionSystem.exceptions.AuctionDoesNotExistException;
import org.auctionsystem.AuctionSystem.services.BidderManagementService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/bid")
public class BidManagementController {

    private BidderManagementService bidderManagementService;

    public BidManagementController(BidderManagementService bidderManagementService) {
        this.bidderManagementService = bidderManagementService;
    }

    public ResponseEntity<?> placeBid(NewBidderRequest newBidderRequest){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(bidderManagementService.bidAuction(newBidderRequest));
        }
        catch(AuctionDoesNotExistException error){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }
}
