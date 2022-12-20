package com.teclas.agenda_angular_spring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
@Data
@Entity
@Table(name = "user")
public class User implements Serializable {
    private static final long serialVersionUID = 2L;

    @Id
    @Basic(optional = false)
    @Column(name = "email")
    private String email;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Lob
    @Column(name = "picture")
    private String picture;

    @Column(name = "password")
    private String password;

    @Column(name = "Rol_idRol")
    private Long rolIdRol;
}
