package com.fitness.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class UserProfile {
    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer user_id;
    private String firstName;
    private String lastName;
    private String gender;
    private Integer age;
    private Double height;
    private Double weight;
    private String goals;

    @OneToOne(mappedBy = "userProfile",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Macro macro;
}
