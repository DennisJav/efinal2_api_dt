package com.ec.controller;

import com.ec.entity.Estudiante;
import com.ec.service.EstudianteSeviceImpl;
import com.ec.service.IEstudianteService;
import com.ec.service.TO.EstudianteTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Access;

@RestController
@RequestMapping(path = "/estudiantes")
@CrossOrigin
public class EstudianteControllerRestful {

    @Autowired
    private IEstudianteService estudianteServices;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public void guardarEstudiante(@RequestBody EstudianteTO estudiante){
        this.estudianteServices.guadarEstudiante(estudiante);
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Estudiante buscarEstudiante(@PathVariable Integer id){
        return this.estudianteServices.buscarEstudianteID(id);
    }


}
