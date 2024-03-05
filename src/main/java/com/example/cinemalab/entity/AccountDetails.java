package com.example.cinemalab.entity;


import com.example.cinemalab.enums.Role;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "accountDetails")
@NoArgsConstructor
@Data
public class AccountDetails extends BaseEntity{
    private String name;

    private String address;

    private String postalCode;

    private String country;

    private String state;

    private String city;

    private int age;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToOne(mappedBy = "accountDetails")
    private UserAccount userAccount;


    public AccountDetails(String name, String address, String postalCode, String country, String state, String city, int age, Role role) {
        this.name = name;
        this.address = address;
        this.postalCode = postalCode;
        this.country = country;
        this.state = state;
        this.city = city;
        this.age = age;
        this.role = role;
    }
}
