package com.example.onboarding.entity;

import jakarta.persistence.*;
import java.time.Instant;

/**
 * JPA entity representing a user in onboarding service.
 */
@Entity
@Table(name = "users")
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // primary key

    @Column(nullable = false, unique = true, length = 100)
    private String username; // username/login id

    @Column(nullable = false, unique = true, length = 150)
    private String email; // user email

    @Column(nullable = false, length = 255)
    private String password; // bcrypt-hashed password

    @Column(nullable = false)
    private boolean enabled = true; // account enabled flag

    @Column(name = "created_at", updatable = false)
    private Instant createdAt = Instant.now();

    @Column(name = "modified_at")
    private Instant modifiedAt = Instant.now();

    // Getters and setters (generate or use Lombok)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }

    public Instant getCreatedAt() { return createdAt; }
    public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }

    public Instant getModifiedAt() { return modifiedAt; }
    public void setModifiedAt(Instant modifiedAt) { this.modifiedAt = modifiedAt; }
}
