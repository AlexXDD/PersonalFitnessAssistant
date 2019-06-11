package ua.edu.nau.personalFitnessAssistant.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import java.sql.Timestamp;

import ua.edu.nau.personalFitnessAssistant.model.typeConverters.DateTypeConverter;

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
@TypeConverters(DateTypeConverter.class)
public class Training {
    @PrimaryKey
    @NonNull
    private
    Timestamp date;
    private Timestamp userParameters;
    private long workoutDay;

    public Training(@NonNull Timestamp date, Timestamp userParameters, long workoutDay) {
        this.date = date;
        this.userParameters = userParameters;
        this.workoutDay = workoutDay;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(@NonNull Timestamp date) {
        this.date = date;
    }

    public Timestamp getUserParameters() {
        return userParameters;
    }

    public void setUserParameters(Timestamp userParameters) {
        this.userParameters = userParameters;
    }

    public long getWorkoutDay() {
        return workoutDay;
    }

    public void setWorkoutDay(long workoutDay) {
        this.workoutDay = workoutDay;
    }
}
