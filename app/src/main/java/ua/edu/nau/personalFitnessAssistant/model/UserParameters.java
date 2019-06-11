package ua.edu.nau.personalFitnessAssistant.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import java.sql.Timestamp;

import ua.edu.nau.personalFitnessAssistant.model.typeConverters.DateTypeConverter;

@Entity(tableName = "user_parameters")
@TypeConverters(DateTypeConverter.class)
public class UserParameters {
    @PrimaryKey
    @NonNull
    private Timestamp date;
    private double weight;
    private double height;
    private double fat;
    private double neck;
    private double shoulders;
    private double chest;
    private double arms;
    private double waist;
    private double hips;
    private double calves;

    public UserParameters(@NonNull Timestamp date, double weight, double height, double fat, double neck, double shoulders, double chest, double arms, double waist, double hips, double calves) {
        this.date = date;
        this.weight = weight;
        this.height = height;
        this.fat = fat;
        this.neck = neck;
        this.shoulders = shoulders;
        this.chest = chest;
        this.arms = arms;
        this.waist = waist;
        this.hips = hips;
        this.calves = calves;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(@NonNull Timestamp date) {
        this.date = date;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getNeck() {
        return neck;
    }

    public void setNeck(double neck) {
        this.neck = neck;
    }

    public double getShoulders() {
        return shoulders;
    }

    public void setShoulders(double shoulders) {
        this.shoulders = shoulders;
    }

    public double getChest() {
        return chest;
    }

    public void setChest(double chest) {
        this.chest = chest;
    }

    public double getArms() {
        return arms;
    }

    public void setArms(double arms) {
        this.arms = arms;
    }

    public double getWaist() {
        return waist;
    }

    public void setWaist(double waist) {
        this.waist = waist;
    }

    public double getHips() {
        return hips;
    }

    public void setHips(double hips) {
        this.hips = hips;
    }

    public double getCalves() {
        return calves;
    }

    public void setCalves(double calves) {
        this.calves = calves;
    }
}
