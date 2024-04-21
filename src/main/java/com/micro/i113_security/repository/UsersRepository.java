package com.micro.i113_security.repository;

import com.micro.i113_security.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<UserEntity, Integer> {

    UserEntity findUserByUsername(String name);

    UserEntity findUserEntityById(Integer id);

}
