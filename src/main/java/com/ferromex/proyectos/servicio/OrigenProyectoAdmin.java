package com.ferromex.proyectos.servicio;

import java.io.Serializable;
import java.util.List;

import com.ferromex.proyectos.dominio.OrigenProyecto;

public interface OrigenProyectoAdmin extends Serializable {

    public List<OrigenProyecto> obtenerOrigenProyecto();

	public OrigenProyecto obtenerOrigenProyectoPorId(String origenProyectoId);

    
}

