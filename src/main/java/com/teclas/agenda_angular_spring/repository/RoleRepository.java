package com.teclas.agenda_angular_spring.repository;

import com.teclas.agenda_angular_spring.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("rolRepository")
public interface RoleRepository extends JpaRepository<Role, Serializable> {
}
