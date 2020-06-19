package com.GymRegister.Models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="TRAININGS", schema = "GYM", catalog="")
public class Training {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Training_id;

    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "training",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.LAZY)
    private List<ExerciseTraining> baskets=new ArrayList<ExerciseTraining>();

    public Training() {
    }
}
