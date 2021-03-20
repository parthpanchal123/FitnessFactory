package com.fitness.demo.service;

import com.fitness.demo.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.fitness.demo.model.UserProfile;
import org.springframework.stereotype.Service;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    @Autowired
    private UserProfileRepository userProfileRepository;

    @Override
    public UserProfile addUserProfile(UserProfile userProfile) {
        return userProfileRepository.save(userProfile);
    }
}
