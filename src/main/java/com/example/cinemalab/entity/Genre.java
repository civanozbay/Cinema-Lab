package com.example.cinemalab.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "genre")
@Data
@NoArgsConstructor
public class Genre extends BaseEntity{

    private String name;

    @ManyToMany(mappedBy = "genres")
    private List<Movie> movies;

    public Genre(String name) {
        this.name = name;
    }
}
