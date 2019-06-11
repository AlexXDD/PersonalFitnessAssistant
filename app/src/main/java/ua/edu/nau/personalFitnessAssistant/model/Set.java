package ua.edu.nau.personalFitnessAssistant.model;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(foreignKeys = @ForeignKey(
        entity = Exercise.class,
        parentColumns = "id",
        childColumns = "exerciseId"))
public class Set {
    @PrimaryKey
    private
    long id;

    //Foreign key
    private long exerciseId;

    private double weight;
    private int reps;
    //Rest time in seconds
    private long restTime;

    public Set(long id, long exerciseId, Double weight, int reps, long restTime) {
        this.id = id;
        this.exerciseId = exerciseId;
        this.weight = weight;
        this.reps = reps;
        this.restTime = restTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(long exerciseId) {
        this.exerciseId = exerciseId;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getReps() {
        return reps;
    }

    public void setReps(Integer reps) {
        this.reps = reps;
    }

    public long getRestTime() {
        return restTime;
    }

    public void setRestTime(long restTime) {
        this.restTime = restTime;
    }
}
