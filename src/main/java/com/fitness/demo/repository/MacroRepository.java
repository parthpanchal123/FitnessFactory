package com.fitness.demo.repository;

import com.fitness.demo.model.Macro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MacroRepository extends JpaRepository<Macro, Integer> {
}
