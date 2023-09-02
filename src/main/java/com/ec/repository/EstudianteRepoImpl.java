package com.ec.repository;

import com.ec.entity.Estudiante;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class EstudianteRepoImpl implements IEstudianteRepo {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void guadarEstudiante(Estudiante estudiante) {
        this.entityManager.persist(estudiante);
    }

    @Override
    public Estudiante buscarEstudianteID(Integer id) {
        return this.entityManager.find(Estudiante.class,id);
    }
}
