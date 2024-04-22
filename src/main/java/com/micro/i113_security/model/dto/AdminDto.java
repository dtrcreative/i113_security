package com.micro.i113_security.model.dto;

import com.micro.i113_security.model.Role;
import com.micro.i113_security.model.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AdminDto {

    private String id;
    private String username;
    private String firstname;
    private String lastname;
    private String email;
    private Role role;
    private Status status;

}
