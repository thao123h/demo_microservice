package com.he187184.mvc.itemservice.dto;


import com.he187184.mvc.itemservice.entity.Item;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDTO {

    private Integer id; // thường không validate vì auto-generated

    @NotNull(message = "OwnerId is required")
    private Integer ownerId;

    @NotBlank(message = "Name is required")
    @Size(max = 100, message = "Name cannot exceed 100 characters")
    private String name;

    // description là JSON dạng String => optional
    private String description;

    @NotNull(message = "Price is required")
    @PositiveOrZero(message = "Price must be >= 0")
    private Double price;

    @PositiveOrZero(message = "Late price must be >= 0")
    private Double latePrice;

    @NotNull(message = "Deposit amount is required")
    @DecimalMin(value = "0.0", inclusive = false, message = "Deposit must be greater than 0")
    private Double depositAmount;

    @NotNull(message = "Amount is required")
    @Min(value = 1, message = "Amount must be at least 1")
    private Integer amount;

    @NotBlank(message = "Address is required")
    private String address;

    @NotNull(message = "Condition rating is required")
    @Min(value = 1, message = "Condition rating must be at least 1")
    @Max(value = 5, message = "Condition rating cannot exceed 5")
    private Integer conditionRating;

    @NotNull(message = "Availability status is required")
    private Item.AvailabilityStatus availabilityStatus;

    @NotNull(message = "isActive must be provided")
    private Boolean isActive;

    private LocalDateTime createdAt; // có thể auto set khi save
    private LocalDateTime updatedAt;
}
