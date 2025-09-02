package com.he187184.mvc.bookingservice.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "bookings")
@Data
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer itemId;   // Không ánh xạ sang Item entity
    private Integer renterId; // Không ánh xạ sang User entity

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Integer rentalHours;

    private Double depositAmount;
    private Double damageFee;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
    private String notes;

    private String cancellationReason;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public enum Status {
        pending, confirmed, cancelled, completed

    }

    public enum PaymentStatus {
        unpaid, paid, refunded

    }
}
