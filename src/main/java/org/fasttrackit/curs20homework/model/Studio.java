package org.fasttrackit.curs20homework.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class Studio {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String address;

    @OneToMany
    @JsonIgnore
    private List<Movie> movies;
}
