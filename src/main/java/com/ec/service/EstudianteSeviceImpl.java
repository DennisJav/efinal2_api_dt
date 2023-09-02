package com.ec.service;

import com.ec.entity.Estudiante;
import com.ec.repository.IEstudianteRepo;
import com.ec.service.TO.EstudianteTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteSeviceImpl implements IEstudianteService{

    @Autowired
    private IEstudianteRepo estudianteRepo;


    @Override
    public void guadarEstudiante(EstudianteTO estudiante) {

        Estudiante estu= new Estudiante();
        estu.setNombre(estudiante.getNombre());
        estu.setCedula(estudiante.getCedula());
        estu.setApellido(estudiante.getApellido());
        this.estudianteRepo.guadarEstudiante(estu);
    }

    @Override
    public Estudiante buscarEstudianteID(Integer id) {
        return this.estudianteRepo.buscarEstudianteID(id);
    }
}
