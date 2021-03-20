package com.fitness.demo.repository;

import com.fitness.demo.model.UserProfile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends CrudRepository<UserProfile, Integer> {

    UserProfile findByUserId(Integer userId);
}
