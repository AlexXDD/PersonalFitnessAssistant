package ua.edu.nau.PersonalFitnesAssistant.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "exercise_group")
public class ExerciseGroup {
    @PrimaryKey
    @NonNull
    String name;

    public ExerciseGroup(@NonNull String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }
}
