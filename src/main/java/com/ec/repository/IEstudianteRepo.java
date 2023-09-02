package com.ec.repository;

import com.ec.entity.Estudiante;

public interface IEstudianteRepo {

    void guadarEstudiante(Estudiante estudiante);
    Estudiante buscarEstudianteID(Integer id);

}
