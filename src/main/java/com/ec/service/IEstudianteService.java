package com.ec.service;

import com.ec.entity.Estudiante;
import com.ec.service.TO.EstudianteTO;

public interface IEstudianteService {
    void guadarEstudiante(EstudianteTO estudiante);

    Estudiante buscarEstudianteID(Integer id);
}
