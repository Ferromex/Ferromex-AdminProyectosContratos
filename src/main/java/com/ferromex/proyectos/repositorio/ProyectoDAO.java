	package com.ferromex.proyectos.repositorio;

import java.util.List;

import com.ferromex.proyectos.dominio.Proyecto;

public interface ProyectoDAO {

    public List<Proyecto> obtenerListaProyectos();
    
    public int guardarProyecto(Proyecto proyecto);
    
    public Proyecto consultarProyectoPorIdProy(int idProy);
    
    public void actualizarProyecto (Proyecto proyecto);
    
}
