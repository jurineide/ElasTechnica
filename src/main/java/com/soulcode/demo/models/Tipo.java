package com.soulcode.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
public class Tipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column
    private String Nome;
}