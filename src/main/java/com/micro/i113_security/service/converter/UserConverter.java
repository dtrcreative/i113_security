package com.micro.i113_security.service.converter;

import com.micro.i113_security.model.Role;
import com.micro.i113_security.model.Status;
import com.micro.i113_security.model.dto.UserDto;
import com.micro.i113_security.model.entity.UserEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
public class UserConverter {

    public UserDto convertToDto(UserEntity entity) {
        return UserDto.builder()
                .username(entity.getUsername())
                .build();
    }

    public UserEntity convertToEntity(UserDto dto) {
        return UserEntity.builder()
                .username(dto.getUsername())
                .firstname(dto.getFirstname())
                .lastname(dto.getLastname())
                .password(new BCryptPasswordEncoder(12).encode(dto.getPassword()))
                .email(dto.getEmail())
                .role(Role.USER)
                .status(Status.ACTIVE)
                .created(new Timestamp(System.currentTimeMillis()))
                .updated(new Timestamp(System.currentTimeMillis()))
                .build();
    }
}
