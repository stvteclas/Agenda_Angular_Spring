package com.teclas.agenda_angular_spring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "email")
public class Email implements Serializable {
    private static final long serialVersionUID = 5L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idemail")
    private Long idEmail;

    @Column(name = "email")
    private String email;

    @Column(name = "contact_idcontact")
    private Integer contactIdContact;
}
