package com.dangvandat.service.impl;

import com.dangvandat.converter.Converter;
import com.dangvandat.dto.UserDTO;
import com.dangvandat.entity.UserEntity;
import com.dangvandat.repository.UserRepository;
import com.dangvandat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDTO> getAllUser() {
        List<UserEntity> users = userRepository.findAll();
        return Converter.toList(users, UserDTO.class);
    }
}
