package ua.edu.nau.personalFitnessAssistant.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "exercise_description",
        foreignKeys = @ForeignKey(
        entity = ExerciseGroup.class,
        parentColumns = "name",
        childColumns = "primaryMuscleName"
))
public class ExerciseDescription {
    @PrimaryKey
    @NonNull
    private
    String name;
    private String type;

    //ExerciseGroupFK
    private String primaryMuscleName;

    private String secondaryMuscles;
    private String equipment;
    private String description;

    public ExerciseDescription(@NonNull String name, String type, String primaryMuscleName, String secondaryMuscles, String equipment, String description) {
        this.name = name;
        this.type = type;
        this.primaryMuscleName = primaryMuscleName;
        this.secondaryMuscles = secondaryMuscles;
        this.equipment = equipment;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrimaryMuscleName() {
        return primaryMuscleName;
    }

    public void setPrimaryMuscleName(String primaryMuscleName) {
        this.primaryMuscleName = primaryMuscleName;
    }

    public String getSecondaryMuscles() {
        return secondaryMuscles;
    }

    public void setSecondaryMuscles(String secondaryMuscles) {
        this.secondaryMuscles = secondaryMuscles;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
