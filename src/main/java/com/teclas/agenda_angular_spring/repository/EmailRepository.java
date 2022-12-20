package com.teclas.agenda_angular_spring.repository;

import com.teclas.agenda_angular_spring.entity.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("EmailRepository")
public interface EmailRepository extends JpaRepository<Email, Serializable> {
}
