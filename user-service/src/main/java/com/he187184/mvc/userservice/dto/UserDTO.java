package com.he187184.mvc.userservice.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDateTime;
import com.he187184.mvc.userservice.entity.User; // import để dùng User.Role

@Data
public class UserDTO {

    private Long id;

    @NotBlank(message = "Email is required")
    @Email(message = "Email format is invalid")
    private String email;

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Phone is required")
    private String phone;

    @NotBlank(message = "Address is required")
    private String address;

    @NotBlank(message = "Identity card is required")
    private String identityCard;

    private String avatar;
    private Boolean isActive;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Dùng enum luôn, giống entity
    @NotNull(message = "Role is required")
    private User.Role role;
}
