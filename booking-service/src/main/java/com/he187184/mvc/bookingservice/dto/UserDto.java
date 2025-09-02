package com.he187184.mvc.bookingservice.dto;

//import com.he187184.mvc.userservice.entity.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserDto {

    private Long id;
    private String email;
    private String name;
    private String phone;
    private String address;
    private String identityCard;
    private String avatar;
    private Boolean isActive;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String role;
}
