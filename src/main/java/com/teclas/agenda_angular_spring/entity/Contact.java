package com.teclas.agenda_angular_spring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "Contact")
public class Contact implements Serializable {
    private static final long serialVersionUID = 3L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idContact")
    private Long idContact;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Lob
    @Column(name = "picture")
    private String picture;

    @Column(name = "user_email")
    private String userEmail;

    @OneToMany(mappedBy = "contactIdContact")
    private List<Email> emailList;

    @OneToMany(mappedBy = "contactIdContact")
    private List<Phone> phoneList ;

    @OneToMany(mappedBy = "contactIdContact")
    private List<Address> addressList ;
}
