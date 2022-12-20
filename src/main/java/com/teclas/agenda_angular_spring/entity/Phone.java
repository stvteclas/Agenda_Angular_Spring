package com.teclas.agenda_angular_spring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "phone")
public class Phone implements Serializable {
    private static final long serialVersionUID = 6L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idphone")
    private Long idPhone;

    @Column(name = "number")
    private String number;

    @Column(name = "contact_idcontact")
    private Integer contactIdContact;
}