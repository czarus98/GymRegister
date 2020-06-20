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

    @Column(nullable = false)
    private String name;

    public Exercise() {
    }

    public Exercise(long exercise_id, String name) {
        Exercise_id = exercise_id;
        this.name = name;
    }

    public long getExercise_id() {
        return Exercise_id;
    }

    public void setExercise_id(long exercise_id) {
        Exercise_id = exercise_id;
    }

    public List<ExerciseTraining> getExerciseTraining() {
        return ExerciseTraining;
    }

    public void setExerciseTraining(List<ExerciseTraining> exerciseTraining) {
        ExerciseTraining = exerciseTraining;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
