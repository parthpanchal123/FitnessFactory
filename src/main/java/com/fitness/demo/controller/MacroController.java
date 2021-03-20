package com.fitness.demo.controller;

import com.fitness.demo.model.Macro;
import com.fitness.demo.service.MacroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fitness/macro")
public class MacroController {

    @Autowired
    private MacroService macroService;

    @GetMapping("/{user_id}")
    public ResponseEntity<Macro> getMacro(@PathVariable Integer user_id){
        Macro macro = macroService.getMacro(user_id);
        return new ResponseEntity<Macro>(macro, HttpStatus.FOUND);
    }
}
