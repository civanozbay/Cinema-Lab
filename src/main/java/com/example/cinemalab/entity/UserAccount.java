package com.example.cinemalab.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "userAccount")
@Data
@NoArgsConstructor
public class UserAccount extends BaseEntity{

    private String email;

    private String password;

    private String username;

    @OneToMany(mappedBy = "userAccount")
    private List<Ticket> tickets;

    @OneToOne
    private AccountDetails accountDetails;

    public UserAccount(String email, String password, String username) {
        this.email = email;
        this.password = password;
        this.username = username;
    }
}
