package com.micro.i113_security.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserDto {

    private String username;
    private String firstname;
    private String lastname;
    private String email;
    private String password;

}
