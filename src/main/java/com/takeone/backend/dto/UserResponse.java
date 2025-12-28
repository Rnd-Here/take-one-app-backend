package com.takeone.backend.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.takeone.backend.entity.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * User Response DTO
 * Contains user information needed by UI
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserResponse {

    private Long id;
    private String uid;
    private String username;
    private String displayName;
    private String profilePictureUrl;
    private AccountType accountType;

    // Profile completion flags
    private Boolean isPortfolioCreated;
    private Boolean isEmailVerified;
    private Boolean isPhoneVerified;
    private Boolean isActive;
}