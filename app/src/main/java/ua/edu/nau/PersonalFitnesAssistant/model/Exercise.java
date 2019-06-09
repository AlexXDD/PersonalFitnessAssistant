package ua.edu.nau.PersonalFitnesAssistant.model;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(foreignKeys = {
        @ForeignKey(
                entity = ExerciseDescription.class,
                parentColumns = "name",
                childColumns = "exerciseDescriptionName"
        ),
        @ForeignKey(
                entity = WorkoutDay.class,
                parentColumns = "id",
                childColumns = "workoutDayId"
        )})
public class Exercise {
    @PrimaryKey
    Long id;

    //ExerciseDescription FK
    String exerciseDescriptionName;
    //WorkoutDay FK
    Long workoutDayId;

    public Exercise(Long id, String exerciseDescriptionName, Long workoutDayId) {
        this.id = id;
        this.exerciseDescriptionName = exerciseDescriptionName;
        this.workoutDayId = workoutDayId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExerciseDescriptionName() {
        return exerciseDescriptionName;
    }

    public void setExerciseDescriptionName(String exerciseDescriptionName) {
        this.exerciseDescriptionName = exerciseDescriptionName;
    }

    public Long getWorkoutDayId() {
        return workoutDayId;
    }

    public void setWorkoutDayId(Long workoutDayId) {
        this.workoutDayId = workoutDayId;
    }
}
