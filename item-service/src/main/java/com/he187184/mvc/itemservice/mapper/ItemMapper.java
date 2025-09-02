package com.he187184.mvc.itemservice.mapper;


import com.he187184.mvc.itemservice.dto.ItemDTO;
import com.he187184.mvc.itemservice.entity.Item;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring") // spring để có thể @Autowired
public interface ItemMapper {

    // Entity -> DTO
    ItemDTO toDTO(Item item);

    // DTO -> Entity
    Item toEntity(ItemDTO itemDTO);
}
