package com.user.entity;


import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String nombre;

    String apellidoP;

    String apellidoM;

    String email;

    @ManyToMany(mappedBy = "users")
    private List<User> users;



}
