package com.ferromex.proyectos.servicio;

import java.io.Serializable;
import java.util.List;

import com.ferromex.proyectos.dominio.Responsable;

public interface ResponsableAdmin extends Serializable {

    public List<Responsable> obtenerResponsables();

    
}
