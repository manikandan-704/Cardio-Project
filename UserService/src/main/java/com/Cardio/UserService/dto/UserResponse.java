package com.Cardio.UserService.dto;
import com.Cardio.UserService.Model.UserRole;
import lombok.Data;

import java.time.LocalDateTime;

@Data  // To generate the Getters and Setters
public class UserResponse {
    private String id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
