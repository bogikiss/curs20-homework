package org.fasttrackit.curs20homework.repository;

import org.fasttrackit.curs20homework.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

}
