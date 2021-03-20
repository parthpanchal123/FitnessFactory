package com.fitness.demo.service;

import com.fitness.demo.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.fitness.demo.model.UserProfile;
import org.springframework.stereotype.Service;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    @Autowired
    private UserProfileRepository userProfileRepository;

    @Autowired
    private MacroService macroService;

    @Override
    public UserProfile addUserProfile(UserProfile userProfile) {

          userProfileRepository.save(userProfile);

          macroService.addMacro(userProfile);

        return userProfile;
    }

    @Override
    public UserProfile getUserProfile(Integer userId) {
        return userProfileRepository.findByUserId(userId);
    }
}
