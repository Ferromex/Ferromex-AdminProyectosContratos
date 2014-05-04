package com.ferromex.proyectos.servicio;

import java.io.Serializable;
import java.util.List;

import com.ferromex.proyectos.dominio.Division;

public interface DivisionAdmin extends Serializable {

    public List<Division> obtenerDivisiones();

	public Division obtenerDivisionPorId(String idDivision);

    
}


