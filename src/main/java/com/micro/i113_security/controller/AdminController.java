package com.micro.i113_security.controller;

import com.micro.i113_security.model.dto.AdminDto;
import com.micro.i113_security.service.AdminService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin //needed to Vue
@RequestMapping("/api/auth/admin")
public class AdminController {

    private AdminService service;

    public AdminController(AdminService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<AdminDto> getAccounts() {
        return service.readAll();
    }

    @PutMapping("/")
    public AdminDto updateUnit(@RequestBody AdminDto unitDto) {
        return service.update(unitDto);
    }

    @DeleteMapping("/{id}")
    public void deleteAccount(@PathVariable("id") int id) {
        service.remove(id);
    }

}
