package com.teclas.agenda_angular_spring.repository;

import com.teclas.agenda_angular_spring.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("phoneRepository")
public interface PhoneRepository extends JpaRepository<Phone, Serializable> {
}
