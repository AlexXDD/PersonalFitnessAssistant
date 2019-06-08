package ua.edu.nau.PersonalFitnesAssistant.model;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.time.LocalTime;

@Entity(foreignKeys =
@ForeignKey(
        entity = WorkoutPlan.class,
        parentColumns = "id",
        childColumns = "workoutPlan"))
public class WorkoutDay {
    @PrimaryKey(autoGenerate = true)
    Long id;
    Long workoutPlan;
    LocalTime approximateTime;
    Integer order;
}
