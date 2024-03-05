package com.example.cinemalab.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "location")
@Data
@NoArgsConstructor
public class Location extends BaseEntity {

    private String name;

    private String address;

    private String postalCode;

    private String country;

    private String state;

    private String city;

    @OneToMany(mappedBy = "location")
    private List<Cinema> cinemas;

    public Location(String name, String address, String postalCode, String country, String state, String city) {
        this.name = name;
        this.address = address;
        this.postalCode = postalCode;
        this.country = country;
        this.state = state;
        this.city = city;
    }
}
