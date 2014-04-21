package com.ferromex.proyectos.servicio;

import java.io.Serializable;
import java.util.List;

import com.ferromex.proyectos.dominio.Proveedor;
import com.ferromex.proyectos.forma.ProveedorForm;

public interface ProveedorAdmin extends Serializable {

	public void crearProveedor(ProveedorForm proveedorForm);
    
    public List<Proveedor> obtenerProveedores();
    
    public void actualizarProveedor(ProveedorForm proveedorForm, int idProv);
    
    public Proveedor consultarProveedor(int idProveedor);
    
    public void eliminarProveedor(int idProveedor);

    
}
