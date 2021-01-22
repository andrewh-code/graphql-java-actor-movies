package com.graphql.service;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.graphql.model.Actor;
import com.graphql.model.Film;
import com.graphql.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by hoand on 2021-01-15.
 */
@Service
public class FilmResolver implements GraphQLResolver<Actor> {

    /**
     *  if we are trying to return a film within the ACtor object, like actor.getFilm() throught he graphql, we have to resolve
     *  the Film object through the actor, hence we can't use the GraphQLQueryREsolver, we need the GraphQLREsolver<T> to pass in
     *  the parent object. In this case, actor
     *  so the query will look like:
     *  retrieveActor{
     *      id
     *      name
     *      dob
     *      film {
     *          id
     *          name
     *      }
     *
     *  }
     */

    @Autowired
    private FilmRepository filmRepository;

    // this function will be implictly called by the service to retrieve the films based off of the actor id
    @Transactional
    public Film getFilm(Actor actor){
        return filmRepository.findById(actor.getFilmId()).get();
    }
}
