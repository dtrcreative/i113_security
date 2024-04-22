package com.micro.i113_security.model.entity;

import com.micro.i113_security.model.Role;
import com.micro.i113_security.model.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;

    String username;
    String firstname;
    String lastname;
    String email;
    String password;

    @Enumerated(EnumType.STRING)
    Role role;
    @Enumerated(EnumType.STRING)
    Status status;

    Timestamp created;
    Timestamp updated;
}
