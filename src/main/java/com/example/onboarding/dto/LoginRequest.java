package com.example.onboarding.dto;

import jakarta.validation.constraints.NotBlank;

/**
 * DTO for login request.
 */
public class LoginRequest {
    @NotBlank
    public String username;

    @NotBlank
    public String password;
}
