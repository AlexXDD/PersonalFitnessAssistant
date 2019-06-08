package ua.edu.nau.PersonalFitnesAssistant.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.sql.Timestamp;

@Entity
public class UserParameters {
    @PrimaryKey
    Timestamp date;
    Double weight;
    Double height;
    Double fat;
    Double neck;
    Double shoulders;
    Double chest;
    Double arms;
    Double waist;
    Double hips;
    Double calves;
}
