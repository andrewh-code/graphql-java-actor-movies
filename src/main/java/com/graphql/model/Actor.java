package com.graphql.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by hoand on 2021-01-15.
 */
@Entity
@Table(name = "actor")
public class Actor {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="actor_id")
    private Integer actorId;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="dob")
    private Date dob;
    @Column(name="address")
    private String address;
    @Column(name="filmid")
    private Integer filmId;

    public Actor(){}

    public Actor(String firstName, String lastName, Date dob, String address, Integer filmId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.address = address;
        this.filmId = filmId;
    }


    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }
}
