package com.he187184.mvc.itemservice.controller;

import com.he187184.mvc.itemservice.dto.ItemDTO;
import com.he187184.mvc.itemservice.entity.Item;
import com.he187184.mvc.itemservice.mapper.ItemMapper;
import com.he187184.mvc.itemservice.repository.ItemRepository;
import com.he187184.mvc.itemservice.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/items")
@RestController
public class ItemController {
    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private ItemMapper itemMapper;
    @GetMapping("/get/{id}")
    public ItemDTO getBooking(@PathVariable Integer id) {
        Item item = itemRepository.getItemById(id);
        ItemDTO dto =  itemMapper.toDTO(item);
        return dto ;
    }

}
