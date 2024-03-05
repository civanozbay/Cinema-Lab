package com.example.cinemalab.entity;

import com.example.cinemalab.enums.MovieState;
import com.example.cinemalab.enums.MovieType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "movie")
@Data
@NoArgsConstructor
public class Movie extends BaseEntity{

    private String name;

    private double price;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private MovieType movieType;

    @Column(name = "state")
    @Enumerated(EnumType.STRING)
    private MovieState movieState;

    private LocalDate releaseDate;

    private int duration;

    private String summary;

    @OneToMany(mappedBy = "movie")
    private List<MovieCinema> movieCinemas;

    @ManyToMany
    @JoinTable(name = "movie_genre_rel",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private List<Genre> genres;

    public Movie(String name, double price, MovieType movieType, MovieState movieState, LocalDate releaseDate, int duration, String summary) {
        this.name = name;
        this.price = price;
        this.movieType = movieType;
        this.movieState = movieState;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.summary = summary;
    }
}
