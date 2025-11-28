package com.example.onboarding.service;

import com.example.onboarding.dto.RegisterRequest;
import com.example.onboarding.entity.AppUser;

/**
 * User service contract for onboarding flows.
 */
public interface UserService {
    AppUser register(RegisterRequest request);
}
