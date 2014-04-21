package com.ferromex.proyectos.repositorio;

import java.util.List;

import com.ferromex.proyectos.dominio.Concurso;

public interface ConcursoDAO {

    public List<Concurso> obtenerListaConcursos();
    
    public int guardarConcurso(Concurso concurso);
    
    public List<Concurso> obtenerConcursoPorIdProy (Integer idProy);
    
    public Concurso obtenerConcursoPorId (Integer idConcurso);
    
    public void actualizarConcurso (Concurso concurso);
    
}
