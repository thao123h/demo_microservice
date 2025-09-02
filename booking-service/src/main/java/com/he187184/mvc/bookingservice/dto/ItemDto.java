package com.he187184.mvc.bookingservice.dto;


//import com.he187184.mvc.itemservice.entity.Item;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDto {

    private Integer id; // thường không validate vì auto-generated



    private String name;

    // description là JSON dạng String => optional
    private String description;
    private Double price;

    private Double latePrice;

    private Double depositAmount;

    private Integer amount;

    private String address;

    private Integer conditionRating;

    private String availabilityStatus;

    private Boolean isActive;

    private LocalDateTime createdAt; // có thể auto set khi save
    private LocalDateTime updatedAt;
}
