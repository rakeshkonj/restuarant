package com.restuarant.restuarant.mapper;

import com.restuarant.restuarant.dtos.UserDTO;
import com.restuarant.restuarant.entities.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO userEntity2DTO(UserEntity userEntity);

    UserEntity userDTO2Entity(UserDTO userDTO);
}
