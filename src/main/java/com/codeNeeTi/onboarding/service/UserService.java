package com.codeNeeTi.onboarding.service;

import com.codeNeeTi.onboarding.dto.RegisterRequest;
import com.codeNeeTi.onboarding.entity.AppUser;

/**
 * User service contract for onboarding flows.
 */
public interface UserService {
    AppUser register(RegisterRequest request);
}
