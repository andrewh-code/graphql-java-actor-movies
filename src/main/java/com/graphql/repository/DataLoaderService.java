package com.graphql.repository;

import com.graphql.model.Actor;
import com.graphql.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.print.DocFlavor;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hoand on 2021-01-15.
 */
@Service
public class DataLoaderService {

    @Autowired
    private ActorRepository actorRepository;

    @Autowired
    private FilmRepository filmRepository;

    // load all data here after spring loads
    @PostConstruct
    public void loadData(){

        String[] actors = {"matthew", "mark", "luke", "john"};

        Map<String, String> films = new HashMap<String, String>() {
            {
                put("matthew", "movie1");
                put("mark", "movie2");
                put("luke", "movie3");
                put("john", "movie4");
            }
        };

        Film film1 = new Film("matthew", new Date());
        filmRepository.save(film1);
        Actor actor1 = new Actor("matthew", "last", new Date(), "123 fake street", film1.getFilmId());
        actorRepository.save(actor1);

        Film film2 = new Film("mark", new Date());
        filmRepository.save(film2);
        Actor actor2 = new Actor("mark", "wahlberg", new Date(), "124 fake street", film2.getFilmId());
        actorRepository.save(actor2);


    }

}
