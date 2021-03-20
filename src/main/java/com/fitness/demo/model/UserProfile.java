package com.fitness.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class UserProfile {
    @Id
    @NonNull
    private Integer user_id;
    private String firstName;
    private String lastName;
    private String gender;
    private Integer age;
    private Double height;
    private Double weight;
    private String goals;
}
