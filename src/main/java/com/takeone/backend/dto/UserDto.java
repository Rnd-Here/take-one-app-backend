package com.takeone.backend.dto;

import com.takeone.backend.entity.AccountType;
import lombok.Data;

@Data
public class UserDto {
    private String uid;
    private String username;
    private String displayName;
    private String email;
    private String mobile;
    private String firstName;
    private String lastName;
    private String profilePictureUrl;
    private AccountType accountType;
    private Boolean isPortfolioCreated;
}
