package com.ferromex.proyectos.servicio;

import java.io.Serializable;
import java.util.List;

import com.ferromex.proyectos.dominio.EstatusProyecto;

public interface EstatusProyectoAdmin extends Serializable {

    public List<EstatusProyecto> obtenerEstatusProyecto();
    
}
