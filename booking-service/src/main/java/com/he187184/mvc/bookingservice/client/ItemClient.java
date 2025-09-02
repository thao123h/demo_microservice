//package com.he187184.mvc.bookingservice.client;
//
//import com.he187184.mvc.bookingservice.dto.ItemDto;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//@FeignClient(name = "item-service")
//public interface ItemClient {
//    @GetMapping("/items/{id}")
//    ItemDto getItem(@PathVariable("id") Integer id );
//}