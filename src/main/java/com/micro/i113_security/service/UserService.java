package com.micro.i113_security.service;

import com.micro.i113_security.exception.AuthUserException;
import com.micro.i113_security.model.dto.UserDto;
import com.micro.i113_security.model.entity.UserEntity;
import com.micro.i113_security.repository.UsersRepository;
import com.micro.i113_security.service.converter.UserConverter;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {

    private UsersRepository usersRepository;
    private UserConverter converter;

    public Optional<UserEntity> findUserByUserName(String userName) {
        return Optional.of(usersRepository.findUserByUsername(userName));
    }

    public UserDto save(UserDto input) {
        try {
            usersRepository.save(converter.convertToEntity(input));
        } catch (Exception e) {
            throw new AuthUserException("UserName or Email already exist", HttpStatus.CONFLICT);
        }
        return converter.convertToDto(new UserEntity());
    }

    public void delete(String userName) {
        Optional<UserEntity> entity = Optional.ofNullable(usersRepository.findUserByUsername(userName));
        entity.ifPresent(foundedEntity -> usersRepository.delete(entity.get()));
    }

}
