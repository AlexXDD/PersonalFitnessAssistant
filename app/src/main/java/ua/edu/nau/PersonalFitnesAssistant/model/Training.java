package ua.edu.nau.PersonalFitnesAssistant.model;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.sql.Timestamp;

@Entity(foreignKeys = {
        @ForeignKey(
                entity = UserParameters.class,
                parentColumns = "date",
                childColumns = "userParameters"
        ),
        @ForeignKey(
                entity = WorkoutDay.class,
                parentColumns = "id",
                childColumns = "workoutDay"
        )})
public class Training {
    @PrimaryKey
    Timestamp date;
    Timestamp userParameters;
    Long workoutDay;
}
