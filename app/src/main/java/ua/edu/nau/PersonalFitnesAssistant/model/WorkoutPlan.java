package ua.edu.nau.PersonalFitnesAssistant.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "workout_plan")
public class WorkoutPlan {
    @PrimaryKey(autoGenerate = true)
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
