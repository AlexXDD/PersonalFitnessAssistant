package ua.edu.nau.personalFitnessAssistant.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "workout_plan")
public class WorkoutPlan {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    private
    long id;
    String name;

    public WorkoutPlan(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
