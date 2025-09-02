package com.he187184.mvc.itemservice.repository;

import com.he187184.mvc.itemservice.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
Item getItemById(int id);
}
