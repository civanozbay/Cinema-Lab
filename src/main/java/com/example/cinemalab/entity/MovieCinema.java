package com.example.cinemalab.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "movieCinema")
@Data
@NoArgsConstructor
public class MovieCinema extends BaseEntity{

    private LocalDate dateTime;

    @ManyToOne
    private Cinema cinema;

    @ManyToOne
    private Movie movie;

    @OneToMany(mappedBy = "movieCinema")
    private List<Ticket> tickets;

    public MovieCinema(LocalDate dateTime) {
        this.dateTime = dateTime;
    }
}
