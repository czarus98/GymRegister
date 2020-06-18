package com.GymRegister.Models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="EXERCISES", schema = "GYM", catalog="")
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Exercise_id;

    @OneToMany(mappedBy = "exercise",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.LAZY)
    private List<ExerciseTraining> ExerciseTraining=new ArrayList<ExerciseTraining>();

    @NotNull
    private String name;

    public Exercise() {
    }
}
