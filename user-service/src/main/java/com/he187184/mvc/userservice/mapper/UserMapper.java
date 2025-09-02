package com.he187184.mvc.userservice.mapper;



import com.he187184.mvc.userservice.dto.UserDTO;

import com.he187184.mvc.userservice.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO toDto(User user);

    User toEntity(UserDTO dto);
}
