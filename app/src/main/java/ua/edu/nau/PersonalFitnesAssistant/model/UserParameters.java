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

    public UserParameters(Timestamp date, Double weight, Double height, Double fat, Double neck, Double shoulders, Double chest, Double arms, Double waist, Double hips, Double calves) {
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

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getFat() {
        return fat;
    }

    public void setFat(Double fat) {
        this.fat = fat;
    }

    public Double getNeck() {
        return neck;
    }

    public void setNeck(Double neck) {
        this.neck = neck;
    }

    public Double getShoulders() {
        return shoulders;
    }

    public void setShoulders(Double shoulders) {
        this.shoulders = shoulders;
    }

    public Double getChest() {
        return chest;
    }

    public void setChest(Double chest) {
        this.chest = chest;
    }

    public Double getArms() {
        return arms;
    }

    public void setArms(Double arms) {
        this.arms = arms;
    }

    public Double getWaist() {
        return waist;
    }

    public void setWaist(Double waist) {
        this.waist = waist;
    }

    public Double getHips() {
        return hips;
    }

    public void setHips(Double hips) {
        this.hips = hips;
    }

    public Double getCalves() {
        return calves;
    }

    public void setCalves(Double calves) {
        this.calves = calves;
    }
}
