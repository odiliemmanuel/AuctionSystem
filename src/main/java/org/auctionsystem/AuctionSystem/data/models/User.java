package org.auctionsystem.AuctionSystem.data.models;


import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class User {

    @Id
    private String id;
    private String name;
    private String emailAddress;
    private String phoneNumber;
    private String password;
    private UserRole userRole;
}
