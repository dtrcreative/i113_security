package com.micro.i113_security.service.converter;

import com.micro.i113_security.model.dto.AdminDto;
import com.micro.i113_security.model.entity.UserEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class AdminConverter {

    public AdminDto convertToDto(UserEntity entity) {
        return AdminDto.builder()
                .id(entity.getId())
                .username(entity.getUsername())
                .firstname(entity.getFirstname())
                .lastname(entity.getLastname())
                .email(entity.getEmail())
                .status(entity.getStatus())
                .role(entity.getRole())
                .build();
    }

    public List<AdminDto> convertAllToDto(List<UserEntity> inputList) {
        return inputList.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }
}
