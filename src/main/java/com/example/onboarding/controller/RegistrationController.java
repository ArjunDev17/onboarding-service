package com.example.onboarding.controller;

import com.example.onboarding.dto.RegisterRequest;
import com.example.onboarding.entity.AppUser;
import com.example.onboarding.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controller to handle registration related endpoints.
 */
@RestController
@RequestMapping("/api/register")
public class RegistrationController {

    private final UserService userService;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    /**
     * Registers a new user.
     */
    @PostMapping
    public ResponseEntity<?> register(@Valid @RequestBody RegisterRequest req) {
        AppUser user = userService.register(req);
        return ResponseEntity.ok("User registered with id: " + user.getId());
    }
}
