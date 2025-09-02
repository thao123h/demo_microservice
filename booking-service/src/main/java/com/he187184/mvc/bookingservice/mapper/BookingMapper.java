package com.he187184.mvc.bookingservice.mapper;

import com.he187184.mvc.bookingservice.dto.BookingDTO;
import com.he187184.mvc.bookingservice.entity.Booking;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring") // spring để có thể @Autowired
public interface BookingMapper {

    // Entity -> DTO
    BookingDTO toDTO(Booking booking);

    // DTO -> Entity
    Booking toEntity(BookingDTO bookingDTO);
}
