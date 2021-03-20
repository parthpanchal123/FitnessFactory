package com.fitness.demo.controller;

import com.fitness.demo.model.UserProfile;
import com.fitness.demo.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fitness/profile")
public class UserProfileController {

    @Autowired
    private UserProfileService userProfileService;

    @PostMapping("/add")
    public ResponseEntity<UserProfile> addUserProfile(@RequestBody UserProfile userProfile) {
        userProfileService.addUserProfile(userProfile);
        return new ResponseEntity<UserProfile>(userProfile, HttpStatus.CREATED);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserProfile> getUserProfile(@PathVariable Integer userId) {
        UserProfile userProfile = userProfileService.getUserProfile(userId);

        return new ResponseEntity<UserProfile>(userProfile, HttpStatus.FOUND);
    }
}
