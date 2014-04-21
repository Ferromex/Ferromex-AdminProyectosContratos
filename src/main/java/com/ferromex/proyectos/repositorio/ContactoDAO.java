package com.ferromex.proyectos.repositorio;

import java.util.List;

import com.ferromex.proyectos.dominio.Contacto;

public interface ContactoDAO {

    public List<Contacto> obtenerListaContactos();
    
    public List<Contacto> obtenerContactosPorIdProv (Integer idProveedor);
    
    public Contacto obtenerContactoPorId (Integer idContacto);
    
}
