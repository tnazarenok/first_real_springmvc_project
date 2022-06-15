package com.example.overone.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "test_model")
@Data
public class TestModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "name")
    String name;

    @Column(name = "last_name")
     String lastName;

    @Column(name = "self_number")
     int selfNumber;

    @Column(name = "age")
     int age;
}
