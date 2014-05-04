package com.ferromex.proyectos.repositorio;

import java.util.List;

import com.ferromex.proyectos.dominio.TipoObras;

public interface TipoObraDAO {

    public List<TipoObras> obtenerListaTipoObrasProveedores();
    
    public TipoObras obtenerTipoObraPorIdObra(Integer idObra);

}
