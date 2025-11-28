package com.example.onboarding.dto;

/**
 * DTO returned after successful authentication.
 */
public record AuthResponse(String token, long expiresInMs) {}
