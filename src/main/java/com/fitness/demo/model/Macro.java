package com.fitness.demo.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Component
public class Macro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer macroId;
    private Double proteins;
    private Double carbs;
    private Double fats;
    private Double dailyCalorie;

    @OneToOne
    @JoinColumn(name = "userId")
    private UserProfile userProfile;

    public Integer getMacroId() {
        return macroId;
    }

    public void setMacroId(Integer macroId) {
        this.macroId = macroId;
    }

    public Double getProteins() {
        return proteins;
    }

    public void setProteins(Double proteins) {
        this.proteins = proteins;
    }

    public Double getCarbs() {
        return carbs;
    }

    public void setCarbs(Double carbs) {
        this.carbs = carbs;
    }

    public Double getFats() {
        return fats;
    }

    public void setFats(Double fats) {
        this.fats = fats;
    }

    public Double getDailyCalorie() {
        return dailyCalorie;
    }

    public void setDailyCalorie(Double dailyCalorie) {
        this.dailyCalorie = dailyCalorie;
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }
}
