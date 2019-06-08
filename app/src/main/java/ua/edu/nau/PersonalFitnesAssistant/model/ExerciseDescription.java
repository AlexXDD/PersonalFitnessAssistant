package ua.edu.nau.PersonalFitnesAssistant.model;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(foreignKeys = @ForeignKey(
        entity = ExerciseGroup.class,
        parentColumns = "name",
        childColumns = "primaryMuscleName"
))
public class ExerciseDescription {
    @PrimaryKey
    String name;
    String type;

    //ExerciseGroupFK
    String primaryMuscleName;

    String secondaryMuscles;
    String equipment;
    String description;
}
