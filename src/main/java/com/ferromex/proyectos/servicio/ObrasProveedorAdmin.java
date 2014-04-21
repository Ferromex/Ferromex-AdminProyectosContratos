package com.ferromex.proyectos.servicio;

import java.io.Serializable;
import java.util.List;

import com.ferromex.proyectos.dominio.ObrasProveedor;

public interface ObrasProveedorAdmin extends Serializable {

	public void crearRelObrasProveedor(ObrasProveedor obrasProveedor);
    
    public List<ObrasProveedor> consultarObrasPorIdProveedor(int idProveedor);
    
    public void  eliminarObrasProveedor(int idProveedor);

    
}
