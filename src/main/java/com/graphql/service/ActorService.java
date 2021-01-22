package com.graphql.service;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphql.model.Actor;
import com.graphql.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by hoand on 2021-01-15.
 */
@Service
public class ActorService implements GraphQLQueryResolver, GraphQLMutationResolver{
    // resolves the query in thes chema to this specific service

    @Autowired
    private ActorRepository repository;

    public List<Actor> getAllActors(){
        return repository.findAll();
    }

    public Actor getActorById(Integer id){
        return repository.findById(id).get();
    }

    public List<Actor> getActorByFirstName(String firstName){
        // how do you find by field?
        List<Actor> actors = repository.findAll();
        List<Actor> results = actors.stream()
                .filter(a -> a.getFirstName().equals(firstName))
                .collect(Collectors.toList());
        return results;
    }

    @Transactional
    public Actor updateAddress(Integer actorId, String newAddress){
        /**
         * mutation{
             updateAddress(id:2, address: "125 faker street"){
                actorId
                firstName
                lastName
                address
            }
         }
         */
        Actor actor = repository.findById(actorId).get();
        actor.setAddress(newAddress);
        repository.save(actor);
        return actor;
    }
}
