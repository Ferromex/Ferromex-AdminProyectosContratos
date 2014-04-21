package com.ferromex.proyectos.repositorio;

import java.util.List;

import com.ferromex.proyectos.dominio.Proveedor;

public interface ProveedorDAO {

    public List<Proveedor> obtenerListaProveedores();
    
    public void guardarProveedor(Proveedor proveedor);
    
    public void actualizarProveedor(Proveedor proveedor);
    
    public Proveedor obtenerProveedorPorId (Integer idProveedor);
    
    public void eliminarProveedor (Integer idProveedor);

}
