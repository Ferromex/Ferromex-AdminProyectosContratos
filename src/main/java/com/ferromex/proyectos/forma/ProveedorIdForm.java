package com.ferromex.proyectos.forma;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProveedorIdForm {

	private static final Logger logger = LoggerFactory.getLogger(ProveedorIdForm.class);

    private int idProveedor;

    public void setIdProveedor(int i) {
    	idProveedor = i;
        logger.info(" - - -  Proveedor: " + idProveedor + "  - - - ");
    }

    public int getIdProveedor() {
        return idProveedor;
    }
}
