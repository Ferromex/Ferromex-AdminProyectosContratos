package com.ferromex.proyectos.forma;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProveedorForm {
	private static final Logger logger = LoggerFactory.getLogger(ProveedorForm.class);

	private String razonSocial;
    private String domFiscal;
	private String domCorrespondencia;
    private Integer registroAbastecimientos;
    private Integer registroProyectos;
    private Integer zonaProveedor;
    private Integer[] obraProveedor;

    public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		logger.info(" - - -  SET Razon Social Proveedor - - - " + razonSocial);
		this.razonSocial = razonSocial;
	}
	public String getDomFiscal() {
		return domFiscal;
	}
	public void setDomFiscal(String domFiscal) {
		this.domFiscal = domFiscal;
	}
	public String getDomCorrespondencia() {
		return domCorrespondencia;
	}
	public void setDomCorrespondencia(String domCorrespondencia) {
		this.domCorrespondencia = domCorrespondencia;
	}
	public Integer getRegistroAbastecimientos() {
		return registroAbastecimientos;
	}
	public void setRegistroAbastecimientos(Integer registroAbastecimientos) {
		this.registroAbastecimientos = registroAbastecimientos;
	}
	public Integer getRegistroProyectos() {
		return registroProyectos;
	}
	public void setRegistroProyectos(Integer registroProyectos) {
		this.registroProyectos = registroProyectos;
	}
	public Integer getZonaProveedor() {
		return zonaProveedor;
	}
	public void setZonaProveedor(Integer zonaProveedor) {
		this.zonaProveedor = zonaProveedor;
	}
	public Integer[] getObraProveedor() {
		return obraProveedor;
	}
	public void setObraProveedor(Integer[] obraProveedor) {
		logger.info(" - - -  SET Obra de Proveedor - - - " + obraProveedor.length);
		this.obraProveedor = obraProveedor;
	}

}

