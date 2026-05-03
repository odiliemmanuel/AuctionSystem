package org.auctionsystem.AuctionSystem.controllers;

import org.auctionsystem.AuctionSystem.dtos.requests.UserLoginRequest;
import org.auctionsystem.AuctionSystem.dtos.requests.UserSignUpRequest;
import org.auctionsystem.AuctionSystem.exceptions.UserAlreadyExistsException;
import org.auctionsystem.AuctionSystem.exceptions.UserDoesNotExistException;
import org.auctionsystem.AuctionSystem.services.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin("*")
@RestController
@RequestMapping("/users")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;


    @PostMapping("/signup")
    public ResponseEntity<?> signup(UserSignUpRequest userSignUpRequest){
        try{
            return ResponseEntity.status(HttpStatus.CREATED).body(authenticationService.signUp(userSignUpRequest));
        }
        catch (UserAlreadyExistsException error){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }



    @PostMapping("/login")
    public ResponseEntity<?> login(UserLoginRequest userLoginRequest){
        try{
            return ResponseEntity.status(HttpStatus.FOUND).body(authenticationService.logIn(userLoginRequest));
        }
        catch (UserDoesNotExistException error){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error.getMessage());
        }
    }


}
