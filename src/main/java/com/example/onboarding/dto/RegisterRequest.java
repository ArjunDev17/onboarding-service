package com.example.onboarding.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 * DTO for register request.
 */
public class RegisterRequest {
    @NotBlank @Size(min = 3, max = 100)
    public String username;

    @NotBlank @Email
    public String email;

    @NotBlank @Size(min = 6, max = 100)
    public String password;
}
