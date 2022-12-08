package com.example.PruebaMDBYAngular.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Tarea {

    @Id
    private String id;
    private String Name;
    private String LastName;
    private String Email;
    private boolean TareaLista;
}
