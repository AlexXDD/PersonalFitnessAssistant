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
}
