package com.fitness.demo.service;

import com.fitness.demo.model.Macro;
import com.fitness.demo.model.UserProfile;
import org.springframework.stereotype.Service;

@Service
public interface MacroService {

    Macro dailyCalories(String gender, Double weight, Double height, int age, Double activity);

    Macro calculateMacro(Double weight, Double calories);

    void addMacro(UserProfile userProfile);

    Macro getMacro(Integer macro_id);

}
