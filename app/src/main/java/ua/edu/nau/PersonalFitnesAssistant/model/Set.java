package ua.edu.nau.PersonalFitnesAssistant.model;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(foreignKeys = @ForeignKey(
        entity = Exercise.class,
        parentColumns = "id",
        childColumns = "exerciseId"))
public class Set {
    @PrimaryKey
    Long id;

    //Foreign key
    Long exerciseId;

    Double weight;
    Integer reps;
    //Rest time in seconds
    Long restTime;
}
