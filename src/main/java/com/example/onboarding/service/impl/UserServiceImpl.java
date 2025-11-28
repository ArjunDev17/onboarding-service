package com.example.onboarding.service.impl;

import com.example.onboarding.dto.RegisterRequest;
import com.example.onboarding.entity.AppUser;
import com.example.onboarding.repository.UserRepository;
import com.example.onboarding.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * User service implementation.
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository,
                           PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    /**
     * Registers a new user. Throws runtime exception on conflicts - you can replace
     * with custom exceptions for better handling.
     */
    @Override
    @Transactional
    public AppUser register(RegisterRequest req) {
        if (userRepository.existsByUsername(req.username)) {
            throw new IllegalArgumentException("username already exists");
        }
        if (userRepository.existsByEmail(req.email)) {
            throw new IllegalArgumentException("email already exists");
        }

        AppUser user = new AppUser();
        user.setUsername(req.username);
        user.setEmail(req.email);
        // hash password
        user.setPassword(passwordEncoder.encode(req.password));
        user.setEnabled(true);

        return userRepository.save(user);
    }
}
