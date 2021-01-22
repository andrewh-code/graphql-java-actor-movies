package com.graphql.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by hoand on 2021-01-15.
 */
@Entity
@Table(name = "film")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="film_id")
    private Integer filmId;

    @Column(name="name")
    private String name;

    @Column(name = "launch_year")
    private Date launchYear;

    public Film(){}

    public Film(String name, Date launchYear) {
        this.name = name;
        this.launchYear = launchYear;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(Date launchYear) {
        this.launchYear = launchYear;
    }
}
