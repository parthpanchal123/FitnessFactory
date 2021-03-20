package com.fitness.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Macro {
    @Id
    private Integer macro_id;
    private Double proteins;
    private Double carbs;
    private Double fats;
}
