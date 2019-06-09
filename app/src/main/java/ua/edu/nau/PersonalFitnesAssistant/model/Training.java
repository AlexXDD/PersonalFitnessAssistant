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

    public Training(Timestamp date, Timestamp userParameters, Long workoutDay) {
        this.date = date;
        this.userParameters = userParameters;
        this.workoutDay = workoutDay;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Timestamp getUserParameters() {
        return userParameters;
    }

    public void setUserParameters(Timestamp userParameters) {
        this.userParameters = userParameters;
    }

    public Long getWorkoutDay() {
        return workoutDay;
    }

    public void setWorkoutDay(Long workoutDay) {
        this.workoutDay = workoutDay;
    }
}
