package com.dangvandat.converter;

import com.dangvandat.dto.UserDTO;
import com.dangvandat.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserConverter extends MapperManager<UserDTO, UserEntity> {

}
