package com.teclas.agenda_angular_spring.repository;

import com.teclas.agenda_angular_spring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Serializable> {
    public List<User> findByEmailAndPassword(String email, String password);
}
