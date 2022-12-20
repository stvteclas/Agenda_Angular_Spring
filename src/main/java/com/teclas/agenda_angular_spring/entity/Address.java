package com.teclas.agenda_angular_spring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "address")
public class Address implements Serializable {
    private static final long serialVersionUID = 4L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idaddress")
    private Long idAddress;

    @Column(name = "description")
    private String description;

    @Column(name = "contact_idcontact")
    private Integer contactIdContact;
}
