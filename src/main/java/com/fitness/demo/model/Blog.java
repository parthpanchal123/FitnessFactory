package com.fitness.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Blog {
    @Id
    private Integer blog_id;
    private String title;
    private String description;
    private Integer likes;
}
