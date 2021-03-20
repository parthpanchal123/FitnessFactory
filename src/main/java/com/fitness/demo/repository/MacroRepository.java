package com.fitness.demo.repository;

import com.fitness.demo.model.Macro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MacroRepository extends CrudRepository<Macro, Integer> {

    Macro findMacroByMacroId(Integer macroId);
}
