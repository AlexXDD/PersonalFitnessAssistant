package ua.edu.nau.personalFitnessAssistant.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "workout_day",
        foreignKeys =
        @ForeignKey(
                entity = WorkoutPlan.class,
                parentColumns = "id",
                childColumns = "workoutPlan"))
public class WorkoutDay {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    private long id;
    private long workoutPlan;
    @NonNull
    private String name;
    private int order;
    private int approximateTime;
    private int numOfExercises = 0;

    public WorkoutDay(long workoutPlan, @NonNull String name, int approximateTime, int order) {
        this.workoutPlan = workoutPlan;
        this.name = name;
        this.approximateTime = approximateTime;
        this.order = order;
    }

    @Ignore
    public WorkoutDay(long workoutPlan, int approximateTime, int order) {
        this.workoutPlan = workoutPlan;
        this.approximateTime = approximateTime;
        this.order = order;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getWorkoutPlan() {
        return workoutPlan;
    }

    public void setWorkoutPlan(long workoutPlan) {
        this.workoutPlan = workoutPlan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getApproximateTime() {
        return approximateTime;
    }

    public void setApproximateTime(int approximateTime) {
        this.approximateTime = approximateTime;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getNumOfExercises() {
        return numOfExercises;
    }

    public void setNumOfExercises(int numOfExercises) {
        this.numOfExercises = numOfExercises;
    }
}
