package com.takeone.backend.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.takeone.backend.entity.AccountType;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Authentication Request
 * Sent from Flutter UI after Firebase authentication
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthRequest {

    @NotBlank(message = "Firebase token is required")
    private String firebaseToken;
}