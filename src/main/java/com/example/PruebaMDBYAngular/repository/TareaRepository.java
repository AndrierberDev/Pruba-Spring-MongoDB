package com.example.PruebaMDBYAngular.repository;

import com.example.PruebaMDBYAngular.models.Tarea;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TareaRepository extends MongoRepository<Tarea, String> {
}
