package com.ferromex.proyectos.servicio;

import java.io.Serializable;
import java.util.List;

import com.ferromex.proyectos.dominio.Contacto;
import com.ferromex.proyectos.forma.ContactoForm;

public interface ContactoAdmin extends Serializable {

	public void crearContacto(ContactoForm contactoform);
    
    public List<Contacto> obtenerContactos();
    
    public void actualizarContacto(ContactoForm contactoForm, int idContacto);
    
    public List<Contacto> consultarContactosProv(int idProveedor);
    
    public Contacto consultarContactoPorId (int idContacto);

    public void  eliminarContacto(int idContacto, int idProveedor);
}

