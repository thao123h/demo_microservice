package com.he187184.mvc.bookingservice.repository;

import com.he187184.mvc.bookingservice.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
    Booking findBookingById(Integer id);
}
