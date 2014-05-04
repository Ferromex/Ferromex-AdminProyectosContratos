package com.ferromex.proyectos.servicio;

import java.io.Serializable;
import java.util.List;

import com.ferromex.proyectos.dominio.TipoObras;

public interface TipoObraAdmin extends Serializable {

	public List<TipoObras> obtenerTipoObraProveedor();

	public TipoObras obtenerTipoObraPorIdObra(Integer idObra);
    
}

