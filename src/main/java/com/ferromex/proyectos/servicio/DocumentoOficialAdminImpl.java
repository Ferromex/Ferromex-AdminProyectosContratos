package com.ferromex.proyectos.servicio;

import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferromex.proyectos.dominio.DocumentoOficial;
import com.ferromex.proyectos.dominio.Empresa;
import com.ferromex.proyectos.dominio.Proveedor;
import com.ferromex.proyectos.dominio.Proyecto;
import com.ferromex.proyectos.dominio.Responsable;
import com.ferromex.proyectos.dominio.TipoDocumento;
import com.ferromex.proyectos.forma.DocumentoOficialForm;
import com.ferromex.proyectos.repositorio.DocumentoOficialDAO;
import com.ferromex.proyectos.repositorio.EmpresaDAO;
import com.ferromex.proyectos.repositorio.ProveedorDAO;
import com.ferromex.proyectos.repositorio.ProyectoDAO;
import com.ferromex.proyectos.repositorio.ResponsableDAO;
import com.ferromex.proyectos.repositorio.TipoDocumentoDAO;

@Service
public class DocumentoOficialAdminImpl implements DocumentoOficialAdmin {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private static final Logger logger = LoggerFactory.getLogger(DocumentoOficialAdminImpl.class);
	
    
    @Autowired
    private DocumentoOficialDAO documentoOficialDao;

    @Autowired
    private EmpresaDAO empresaDao;

    @Autowired
    private TipoDocumentoDAO tipoDocDao;

    @Autowired
    private ProyectoDAO proyectoDao;

    @Autowired
    private ResponsableDAO responsableDao;

    @Autowired
    private ProveedorDAO proveedorDao;

    public void setDocumentoOficialDao(DocumentoOficialDAO documentoOficialDao) {
        this.documentoOficialDao = documentoOficialDao;
    }
    
	@Override
	public void crearDocumentoOficial(DocumentoOficialForm documentoOficialForm) {
		
    	DocumentoOficial docOficial = new DocumentoOficial();
		
    	List<Empresa> listaEmpresas = empresaDao.obtenerListaEmpresas();
    	
		Iterator<Empresa> iterator = listaEmpresas.iterator();
		
		while (iterator.hasNext()) {
			Empresa empresa = iterator.next();

		    if (empresa.getIdEmpresa().equals(documentoOficialForm.getEmpresa())) {
		    	docOficial.setEmpresa(empresa);
		    }
		}

    	docOficial.setFechaElaboracion(documentoOficialForm.getFechaElaboracion());
    	List<TipoDocumento> listaTipoDocs = tipoDocDao.obtenerListaTipoDocumento();
    	
		Iterator<TipoDocumento> iTipoDocs = listaTipoDocs.iterator();
		
		while (iTipoDocs.hasNext()) {
			TipoDocumento tipoDocumento = iTipoDocs.next();

		    if (tipoDocumento.getIdTipoDocumento() == documentoOficialForm.getTipoDocumento()) {
		    	docOficial.setTipoDocumento(tipoDocumento);
		    }
		}

    	docOficial.setDirigidoA(documentoOficialForm.getDirigidoA());
    	Proyecto proyecto = proyectoDao.consultarProyectoPorIdProy(documentoOficialForm.getProyecto());
    	docOficial.setProyecto(proyecto);

    	List<Responsable> listaResponsables = responsableDao.obtenerListaResponsables();
    	
		Iterator<Responsable> iResponsables = listaResponsables.iterator();
		
		while (iResponsables.hasNext()) {
			Responsable responsable = iResponsables.next();

		    if (responsable.getIdResponsable() == documentoOficialForm.getElaboro()) {
		    	docOficial.setElaboro(responsable);
		    }
		}

    	docOficial.setObservaciones(documentoOficialForm.getObservaciones());
    	
    	Proveedor proveedor = proveedorDao.obtenerProveedorPorId(documentoOficialForm.getProveedor());
    	docOficial.setProveedor(proveedor);
    	docOficial.setTipoObra(documentoOficialForm.getTipoObra());
        

		
		documentoOficialDao.guardarDocumentoOficial(docOficial);

	}

	@Override
	public List<DocumentoOficial> obtenerDocumentosOficiales() {
		return documentoOficialDao.obtenerListaDocsOficiales();
	}

}