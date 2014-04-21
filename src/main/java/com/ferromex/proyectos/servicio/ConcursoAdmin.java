package com.ferromex.proyectos.servicio;

import java.io.Serializable;
import java.util.List;

import com.ferromex.proyectos.dominio.Concurso;
import com.ferromex.proyectos.forma.ConcursoForm;

public interface ConcursoAdmin extends Serializable {

	public int crearConcurso(Concurso concurso);
    
    public List<Concurso> obtenerConcursos();
    
    public void actualizarConcurso(ConcursoForm concursoForm);
    
    public Concurso consultarConcursoPorId (int idConcurso);

}

