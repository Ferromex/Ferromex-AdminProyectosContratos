package com.ferromex.proyectos.servicio;

import java.io.Serializable;
import java.util.List;

import com.ferromex.proyectos.dominio.TipoConcurso;


public interface TipoConcursoAdmin extends Serializable {

    public List<TipoConcurso> obtenerTipoConcurso();
    
}
