package com.teclas.agenda_angular_spring.service;

import com.teclas.agenda_angular_spring.entity.Role;
import com.teclas.agenda_angular_spring.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rol")
@CrossOrigin
@RequiredArgsConstructor
public class RolService {
    private final RoleRepository roleRepository;

    @GetMapping("/find")
    public List<Role> getAllRol(){
        return roleRepository.findAll();
    }
    @PostMapping("/save")
    public Role save(@RequestBody Role role){
        return roleRepository.save(role);
    }
}
