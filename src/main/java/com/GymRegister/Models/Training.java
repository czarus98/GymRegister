package com.GymRegister.Models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="TRAININGS", schema = "GYM", catalog="")
public class Training {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Training_id;

    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "training",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.LAZY)
    private List<ExerciseTraining> baskets=new ArrayList<ExerciseTraining>();

    public Training() {
    }

    public Training(Long training_id) {
        Training_id = training_id;
    }

    public Long getTraining_id() {
        return Training_id;
    }

    public void setTraining_id(Long training_id) {
        Training_id = training_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<ExerciseTraining> getBaskets() {
        return baskets;
    }

    public void setBaskets(List<ExerciseTraining> baskets) {
        this.baskets = baskets;
    }
}
