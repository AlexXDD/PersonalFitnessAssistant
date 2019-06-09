package ua.edu.nau.PersonalFitnesAssistant.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(foreignKeys =
@ForeignKey(
        entity = WorkoutPlan.class,
        parentColumns = "id",
        childColumns = "workoutPlan"))
public class WorkoutDay {
    @PrimaryKey(autoGenerate = true)
    private
    Long id;
    private Long workoutPlan;
    @NonNull
    private String name;
    private Integer approximateTime;
    private Integer order;
    private Integer numOfExercises;

    public WorkoutDay(Long id, Long workoutPlan, @NonNull String name, Integer approximateTime, Integer order) {
        this.id = id;
        this.workoutPlan = workoutPlan;
        this.name = name;
        this.approximateTime = approximateTime;
        this.order = order;
    }

    public WorkoutDay(Long id, Long workoutPlan, Integer approximateTime, Integer order) {
        this.id = id;
        this.workoutPlan = workoutPlan;
        this.approximateTime = approximateTime;
        this.order = order;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWorkoutPlan() {
        return workoutPlan;
    }

    public void setWorkoutPlan(Long workoutPlan) {
        this.workoutPlan = workoutPlan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getApproximateTime() {
        return approximateTime;
    }

    public void setApproximateTime(Integer approximateTime) {
        this.approximateTime = approximateTime;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getNumOfExercises() {
        return numOfExercises;
    }

    public void setNumOfExercises(Integer numOfExercises) {
        this.numOfExercises = numOfExercises;
    }
}
