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
    long id;

    //ExerciseDescription FK
    String exerciseDescriptionName;
    //WorkoutDay FK
    long workoutDayId;

    public Exercise(Long id, String exerciseDescriptionName, Long workoutDayId) {
        this.id = id;
        this.exerciseDescriptionName = exerciseDescriptionName;
        this.workoutDayId = workoutDayId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getExerciseDescriptionName() {
        return exerciseDescriptionName;
    }

    public void setExerciseDescriptionName(String exerciseDescriptionName) {
        this.exerciseDescriptionName = exerciseDescriptionName;
    }

    public long getWorkoutDayId() {
        return workoutDayId;
    }

    public void setWorkoutDayId(long workoutDayId) {
        this.workoutDayId = workoutDayId;
    }
}
