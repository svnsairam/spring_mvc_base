package com.pluralsight.model;

import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "goalTable")
public class Goal {
    @Id
    @GeneratedValue
    @Column(name = "GOAL_ID")
    private long id;

    @Range(min = 1, max = 120)
    @Column(name = "MINUTES")
    private int minutes;

    @OneToMany(mappedBy = "goal", cascade = CascadeType.ALL)
    private List<Exercise> exercises =  new ArrayList<>();

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

}
