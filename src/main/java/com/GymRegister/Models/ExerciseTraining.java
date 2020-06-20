package com.GymRegister.Models;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name="EXERCISE_TRAINING", schema = "GYM", catalog="")
public class ExerciseTraining {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ExerciseTraining_id;

    @Column(nullable = false)
    private int sets_number;

    @Column(nullable = false)
    private int repetitions_number;

    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    @JoinColumn(name = "exercise_id")
    private Exercise exercise;

    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    @JoinColumn(name = "training_id")
    private Training training;

    public ExerciseTraining(long exerciseTraining_id, int sets_number, int repetitions_number) {
        ExerciseTraining_id = exerciseTraining_id;
        this.sets_number = sets_number;
        this.repetitions_number = repetitions_number;
    }

    public ExerciseTraining() {
    }

    public long getExerciseTraining_id() {
        return ExerciseTraining_id;
    }

    public void setExerciseTraining_id(long exerciseTraining_id) {
        ExerciseTraining_id = exerciseTraining_id;
    }

    public int getSets_number() {
        return sets_number;
    }

    public void setSets_number(int sets_number) {
        this.sets_number = sets_number;
    }

    public int getRepetitions_number() {
        return repetitions_number;
    }

    public void setRepetitions_number(int repetitions_number) {
        this.repetitions_number = repetitions_number;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public Training getTraining() {
        return training;
    }

    public void setTraining(Training training) {
        this.training = training;
    }
}
