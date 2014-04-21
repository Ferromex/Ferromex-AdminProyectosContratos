package com.ferromex.proyectos.servicio;

import java.io.Serializable;
import java.util.List;

import com.ferromex.proyectos.dominio.TipoDocumento;

public interface TipoDocAdmin extends Serializable {

    public List<TipoDocumento> obtenerTipoDocumento();

    
}


