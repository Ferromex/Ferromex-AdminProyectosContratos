package com.ferromex.proyectos.servicio;

import java.io.Serializable;
import java.util.List;

import com.ferromex.proyectos.dominio.Zona;

public interface ZonaAdmin extends Serializable {

	public List<Zona> obtenerZonasProveedor();
    
}

