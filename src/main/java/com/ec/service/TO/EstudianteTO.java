package com.ec.service.TO;

import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;

public class EstudianteTO extends RepresentationModel<EstudianteTO> implements Serializable {
    private static final long serialVersionUID = 1L;

    private String token;
    private String nombre;
    private String apellido;
    private String cedula;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
