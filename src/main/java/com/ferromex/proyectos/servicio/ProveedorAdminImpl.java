package com.ferromex.proyectos.servicio;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferromex.proyectos.dominio.Proveedor;
import com.ferromex.proyectos.dominio.TipoObras;
import com.ferromex.proyectos.dominio.Zona;
import com.ferromex.proyectos.forma.ProveedorForm;
import com.ferromex.proyectos.repositorio.ObrasProveedorDAO;
import com.ferromex.proyectos.repositorio.ProveedorDAO;
import com.ferromex.proyectos.repositorio.TipoObraDAO;
import com.ferromex.proyectos.repositorio.ZonaDAO;

@Service
public class ProveedorAdminImpl implements ProveedorAdmin{

	private static final long serialVersionUID = 1L;

	private static final Logger logger = LoggerFactory.getLogger(ProveedorAdminImpl.class);
	
    
    @Autowired
    private ProveedorDAO proveedorDao;

    @Autowired
    private ObrasProveedorDAO obrasProveedorDao;
    
    @Autowired
    private TipoObraDAO tipoObrasDao;

    @Autowired
    private ZonaDAO zonaDao;

    public void setProveedorDao(ProveedorDAO proveedorDao) {
        this.proveedorDao = proveedorDao;
    }
    
	@Override
	public void crearProveedor(ProveedorForm proveedorForm) {

		logger.info(" - - -  Metodo Crear Proveedor  " + proveedorForm.toString()+ "- - - ");

    	Proveedor prov = new Proveedor();
    	

    	List<Zona> zonas = zonaDao.obtenerListaZonasProveedores();
    	
		Iterator<Zona> iterator = zonas.iterator();
		
		while (iterator.hasNext()) {
			Zona zona = iterator.next();

		    if (zona.getIdZona() == proveedorForm.getZonaProveedor()) {
		    	prov.setZonap(zona);
		    }
		}

    	prov.setRazonSocial(proveedorForm.getRazonSocial());
    	prov.setDomicilioFiscal(proveedorForm.getDomFiscal());
    	prov.setDomCorrespondencia(proveedorForm.getDomCorrespondencia());
    	prov.setRegistroAbast(proveedorForm.getRegistroAbastecimientos());
    	prov.setRegistroProyectos(proveedorForm.getRegistroProyectos());

    	Integer[] obrasNuevas=proveedorForm.getObraProveedor();
    	
    	Set<TipoObras> obrasProv =  new HashSet<TipoObras>();
    	
    	List<TipoObras> tiposObra= tipoObrasDao.obtenerListaTipoObrasProveedores();

		for(Integer idNuevaObra : obrasNuevas) {
			for(TipoObras obraCat: tiposObra){
				 if (obraCat.getIdObra() == idNuevaObra) {
				    	obrasProv.add(obraCat);
				 }
			}
		}
		
		prov.setObras(obrasProv);
		
		proveedorDao.guardarProveedor(prov);
	}

	@Override
	public List<Proveedor> obtenerProveedores() {
		logger.info("- - - Obtener Proveedores - - - ");
		return proveedorDao.obtenerListaProveedores();
	}

	@Override
	public void actualizarProveedor(ProveedorForm proveedorForm, int idProv) {

		logger.info(" - - -  Servicio Actualizar Proveedor  - - - ");
		
        Proveedor prov = proveedorDao.obtenerProveedorPorId(idProv);
    	
        Zona zona = prov.getZonap();
    	zona.setIdZona(proveedorForm.getZonaProveedor());
        
        prov.setIdProveedor(idProv);
        prov.setDomicilioFiscal(proveedorForm.getDomFiscal());
        prov.setDomCorrespondencia(proveedorForm.getDomCorrespondencia());
        prov.setRazonSocial(proveedorForm.getRazonSocial());
        prov.setRegistroAbast(proveedorForm.getRegistroAbastecimientos());
        prov.setRegistroProyectos(proveedorForm.getRegistroProyectos());
        prov.setZonap(zona);
        
        Integer[] obras=proveedorForm.getObraProveedor();
        
    	List<TipoObras> tiposObra= tipoObrasDao.obtenerListaTipoObrasProveedores();
    	
    	Set<TipoObras> obrasProv = prov.getObras();
    	
    	obrasProv.clear();

		for(Integer idNuevaObra : obras) {
			for(TipoObras obraCat: tiposObra){
				 if (obraCat.getIdObra() == idNuevaObra) {
					 obrasProv.add(obraCat);	
				 }
			}
		}
		
		prov.setObras(obrasProv);
		
    	proveedorDao.actualizarProveedor(prov);

	}

	@Override
	public Proveedor consultarProveedor(int idProveedor) {
		logger.info("- - - Obtener  datos del Proveedor - - - " + idProveedor);
		return proveedorDao.obtenerProveedorPorId(idProveedor);
	}

	@Override
	public void  eliminarProveedor(int idProveedor) {
		logger.info("- - - Obtener  datos del Proveedor - - - " + idProveedor);
		proveedorDao.eliminarProveedor(idProveedor);
	}
}

