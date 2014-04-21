package com.ferromex.proyectos.servicio;

import java.io.Serializable;
import java.util.List;

import com.ferromex.proyectos.dominio.Proyecto;
import com.ferromex.proyectos.forma.ProyectoForm;

public interface ProyectoAdmin extends Serializable {

	public int crearProyecto(ProyectoForm proyectoForm);
    
    public List<Proyecto> obtenerProyectos();
    
    public Proyecto consultaProyectoPorIdProyecto(int idProyecto);
    
    public void actualizarProyecto (ProyectoForm proyectoform);
}


