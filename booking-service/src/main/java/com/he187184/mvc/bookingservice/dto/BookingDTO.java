package com.he187184.mvc.bookingservice.dto;

import com.he187184.mvc.bookingservice.entity.Booking;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookingDTO {
    private Integer id;

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Integer rentalHours;

    private Double depositAmount;
    private Double damageFee;

    @Enumerated(EnumType.STRING)
    private Booking.Status status;

    @Enumerated(EnumType.STRING)
    private Booking.PaymentStatus paymentStatus;


    private String cancellationReason;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public enum Status {
        pending,confirmed, cancelled, completed
    }

    public enum PaymentStatus {
        unpaid,paid, refunded
    }
}
