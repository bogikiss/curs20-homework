package org.fasttrackit.curs20homework.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@With
@Builder(toBuilder = true)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Movie {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String name;
    @Column
    private int year;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private MovieRating movieRating;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Review> reviews;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private Studio studio;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Actor> actors;
}
