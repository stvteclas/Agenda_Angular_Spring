package com.teclas.agenda_angular_spring.repository;

import com.teclas.agenda_angular_spring.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("addressRepository")
public interface AddressRepository extends JpaRepository<Address, Serializable> {
}
