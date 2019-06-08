package ua.edu.nau.PersonalFitnesAssistant.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class WorkoutPlan {
    @PrimaryKey(autoGenerate = true)
    Long id;
    String name;
}
