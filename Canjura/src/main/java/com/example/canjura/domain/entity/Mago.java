package com.example.canjura.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "Magos")
public class Mago {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 50)
    private String house;

    @Column(nullable = false, length = 80)
    private String patronus;

    @Column(name = "is_deatheater", nullable = false)
    private Boolean isDeatheater;

    public Mago() {
    }

    public Mago(UUID id, String name, String house, String patronus, Boolean isDeatheater) {
        this.id = id;
        this.name = name;
        this.house = house;
        this.patronus = patronus;
        this.isDeatheater = isDeatheater;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getPatronus() {
        return patronus;
    }

    public void setPatronus(String patronus) {
        this.patronus = patronus;
    }

    public Boolean getIsDeatheater() {
        return isDeatheater;
    }

    public void setIsDeatheater(Boolean deatheater) {
        isDeatheater = deatheater;
    }
}