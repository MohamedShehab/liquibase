package com.example.liquibasedemo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "persons")
@Data
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "firstname2222")
    private String firstName;

    @Column(name = "lastname", nullable = false)
    private String lastName;

    @Column(name = "age")
    private int age;
}
