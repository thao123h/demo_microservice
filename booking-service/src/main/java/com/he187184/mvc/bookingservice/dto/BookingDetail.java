package com.he187184.mvc.bookingservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingDetail {
    BookingDTO bookingDTO;
    ItemDto itemDTO;
    UserDto userDTO;
}
