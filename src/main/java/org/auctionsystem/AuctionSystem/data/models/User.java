package org.auctionsystem.AuctionSystem.data.models;


import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class User {

    @Id
    String id;
    String name;
    String emailAddress;
    String phoneNumber;
    String password;
    UserRole role;
}
