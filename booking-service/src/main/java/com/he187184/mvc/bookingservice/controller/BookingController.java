package com.he187184.mvc.bookingservice.controller;
//
//import com.he187184.mvc.bookingservice.client.ItemClient;
//import com.he187184.mvc.bookingservice.client.UserClient;
import com.he187184.mvc.bookingservice.dto.BookingDTO;
import com.he187184.mvc.bookingservice.entity.Booking;
import com.he187184.mvc.bookingservice.mapper.BookingMapper;
import com.he187184.mvc.bookingservice.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/bookings")
@RestController
public class BookingController {
    @Autowired
    private BookingRepository bookingRepository;
//    @Autowired
//    private ItemClient itemClient;
//    @Autowired
//    private UserClient userClient;
    @Autowired
    private BookingMapper bookingMapper;
    @GetMapping("/get/{id}")
    public BookingDTO getBooking(@PathVariable Integer id) {
        Booking booking = bookingRepository.findBookingById(id);
        BookingDTO bookingDTO = bookingMapper.toDTO(booking);
        return bookingDTO;

    }

}
