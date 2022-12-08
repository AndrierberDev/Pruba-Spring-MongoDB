package com.example.PruebaMDBYAngular.controllers;


import com.example.PruebaMDBYAngular.models.Tarea;
import com.example.PruebaMDBYAngular.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/Tareas")
public class TareaController {

    @Autowired
    private TareaRepository tareaRepository;

    @GetMapping("")
    List<Tarea> index(){
        return tareaRepository.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create")
    Tarea create(@RequestBody Tarea tarea){
        return tareaRepository.save(tarea);
    }

    @PutMapping("{id}")
    Tarea Update(@PathVariable String id, @RequestBody Tarea tarea){
        Tarea tareaFront = tareaRepository.findById(id).orElseThrow(RuntimeException::new);

        tareaFront.setName(tarea.getName());
        tareaFront.setTareaLista(tarea.isTareaLista());

        return tareaRepository.save(tareaFront);
    }



}
