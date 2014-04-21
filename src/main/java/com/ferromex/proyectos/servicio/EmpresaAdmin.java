package com.ferromex.proyectos.servicio;

import java.io.Serializable;
import java.util.List;

import com.ferromex.proyectos.dominio.Empresa;

public interface EmpresaAdmin extends Serializable {

    public List<Empresa> obtenerEmpresas();

    
}

