package com.ferromex.proyectos.repositorio;

import java.util.List;

import com.ferromex.proyectos.dominio.ObrasProveedor;

public interface ObrasProveedorDAO {

    public void guardarObrasProveedor(ObrasProveedor obrasProveedor);
    
    public List<ObrasProveedor> obtenerObrasPorIdProveedor (Integer idProveedor);
    
    public void eliminarRelacionesProveedor(int idProveedor);

}

