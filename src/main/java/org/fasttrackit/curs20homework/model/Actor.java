package org.fasttrackit.curs20homework.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Actor {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private int birthYear;

    @ManyToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Movie> movies;
}
