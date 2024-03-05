package com.example.cinemalab.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "ticket")
@Data
@NoArgsConstructor
public class Ticket extends BaseEntity{

    private LocalDate dateTime;

    private int seatNumber;

    private int rowNumber;

    @ManyToOne
    private MovieCinema movieCinema;

    @ManyToOne
    private UserAccount userAccount;

    public Ticket(LocalDate dateTime, int seatNumber, int rowNumber) {
        this.dateTime = dateTime;
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
    }
}
