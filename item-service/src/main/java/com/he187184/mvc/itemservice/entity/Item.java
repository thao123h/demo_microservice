package com.he187184.mvc.itemservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "items")

public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer ownerId; // Không dùng @ManyToOne (vì khác DB)

    private String name;

    @Column(columnDefinition = "json")
    private String description;

    private Double price;
    private Double latePrice;
    private Double depositAmount;

    private Integer amount;
    private String address;
    private Integer conditionRating;

    @Enumerated(EnumType.STRING)
    private AvailabilityStatus availabilityStatus;

    private Boolean isActive;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public enum AvailabilityStatus {
        available, unavailable, maintenance

    }
}

