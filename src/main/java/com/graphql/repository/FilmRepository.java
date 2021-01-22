package com.graphql.repository;

import com.graphql.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * Created by hoand on 2021-01-15.
 */
@Service
public interface FilmRepository extends JpaRepository<Film, Integer>{

}
