package com.teclas.agenda_angular_spring.repository;

import com.teclas.agenda_angular_spring.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("contactRepository")
public interface ContactRepository extends JpaRepository<Contact, Serializable> {
    public List<Contact> findByUserEmail (String userEmail);
}
