package com.fitness.demo.service;

import com.fitness.demo.model.Macro;
import com.fitness.demo.model.UserProfile;
import com.fitness.demo.repository.MacroRepository;
import com.fitness.demo.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MacroServiceImpl implements MacroService {

    @Autowired
    private UserProfileRepository userProfileRepository;

    @Autowired
    private MacroRepository macroRepository;

    @Autowired
    private Macro macro;

    @Override
    public Macro dailyCalories(String gender, Double weight, Double height, int age, Double activity) {

        Double dailyCalorie;
        Double total;

        Double utility = gender.equals("Male") ? 5.0 : -161.0;

        total =  10 * weight + (6.25 * height) - (5 * age) + utility;
        dailyCalorie = total * activity;

        return calculateMacro(weight, dailyCalorie);
    }

    @Override
    public Macro calculateMacro(Double weight, Double dailyCalorie) {
        Double proteins, carbs, fats;

        /* 40 % Total Calorie */
        /* 1gm Carb = 4cal */
        Double carbCalories = (dailyCalorie * 40) / 100;
        carbs = carbCalories / 4;

        /* 30 % Total Calorie */
        /* 1gm Protein = 4cal */
        Double proteinCalories = (dailyCalorie * 30) / 100;
        proteins = proteinCalories / 4;

        /* 30 % Total Calorie */
        /* 1gm Fat = 9cal */
        Double fatCalories = (dailyCalorie * 30) / 100;
        fats = fatCalories / 9;

        macro.setCarbs(carbs);
        macro.setProteins(proteins);
        macro.setFats(fats);
        macro.setDailyCalorie(dailyCalorie);

        return macro;
    }

    @Override
    public void addMacro(UserProfile userProfile) {
            macro = dailyCalories(userProfile.getGender(), userProfile.getWeight(), userProfile.getHeight(),
                    userProfile.getAge(), userProfile.getActivity());

            macro.setUserProfile(userProfile);

            //UserProfile profile = userProfileRepository.findByUserId(userProfile.getUserId());
            //userProfile.setMacro(macro);
            //userProfileRepository.save(userProfile);

            macroRepository.save(macro);
    }

    @Override
    public Macro getMacro(Integer user_id) {
        Integer macro_id = userProfileRepository.findByUserId(user_id).getMacro().getMacroId();
        return macroRepository.findMacroByMacroId(macro_id);
    }
}
