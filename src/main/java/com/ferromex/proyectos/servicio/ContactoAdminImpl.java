package com.ferromex.proyectos.servicio;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferromex.proyectos.dominio.Contacto;
import com.ferromex.proyectos.dominio.Proveedor;
import com.ferromex.proyectos.forma.ContactoForm;
import com.ferromex.proyectos.repositorio.ContactoDAO;
import com.ferromex.proyectos.repositorio.ProveedorDAO;

@Service
public class ContactoAdminImpl implements ContactoAdmin{

	private static final long serialVersionUID = 1L;

	private static final Logger logger = LoggerFactory.getLogger(ContactoAdminImpl.class);
	
    
    @Autowired
    private ContactoDAO contactoDao;
    
    @Autowired
    private ProveedorDAO proveedorDao;


    public void setContactoDao(ContactoDAO contactoDao) {
        this.contactoDao = contactoDao;
    }
    
	@Override
	public void crearContacto(ContactoForm contactoForm) {
		logger.info(" - - -  Metodo Crear Contacto  " + contactoForm.toString()+ "- - - ");
		
		Contacto contacto = new Contacto();

		Proveedor proveedor = proveedorDao.obtenerProveedorPorId(contactoForm.getProveedor());

		contacto.setProveedor(proveedor);
		contacto.setNombreContacto(contactoForm.getNombreContacto());
		contacto.setApPaterno(contactoForm.getApellidoPaterno());
    	contacto.setApMaterno(contactoForm.getApellidoMaterno());
    	contacto.setEmail(contactoForm.getEmail());
    	contacto.setTelOficina(contactoForm.getTelefonoOficina());
    	contacto.setMovil1(contactoForm.getMovil1());
    	contacto.setMovil2(contactoForm.getMovil2());
    	contacto.setPrincipal(contactoForm.getPrincipal());
    	contacto.setEmail2(contactoForm.getEmail2());
    	contacto.setEmail3(contactoForm.getEmail3());
    	contacto.setEmail4(contactoForm.getEmail4());
    	
		Set<Contacto> contactos = proveedor.getContactos();
		
		contactos.add(contacto);

		proveedor.setContactos(contactos);
    	
		proveedorDao.actualizarProveedor(proveedor);
		
	}

	@Override
	public List<Contacto> obtenerContactos() {
		logger.info("- - - Obtener Contactos - - - ");
		return contactoDao.obtenerListaContactos();
	}

	@Override
	public void actualizarContacto(ContactoForm contactoForm, int idCont) {
    	
    	Contacto contacto = contactoDao.obtenerContactoPorId(idCont);
		Proveedor proveedor = proveedorDao.obtenerProveedorPorId(contactoForm.getProveedor());
        
		contacto.setProveedor(proveedor);
        contacto.setNombreContacto(contactoForm.getNombreContacto());
        contacto.setApPaterno(contactoForm.getApellidoPaterno());
        contacto.setApMaterno(contactoForm.getApellidoMaterno());
        contacto.setEmail(contactoForm.getEmail());
        contacto.setTelOficina(contactoForm.getTelefonoOficina());
        contacto.setMovil1(contactoForm.getMovil1());
        contacto.setMovil2(contactoForm.getMovil2());
        contacto.setPrincipal(contactoForm.getPrincipal());
        contacto.setEmail2(contactoForm.getEmail2());
        contacto.setEmail3(contactoForm.getEmail3());
        contacto.setEmail4(contactoForm.getEmail4());

		Set<Contacto> contactos = proveedor.getContactos();
		
		Iterator<Contacto> iterator = contactos.iterator();
		
		while (iterator.hasNext()) {
			Contacto eliminarIt = iterator.next();

		    if (eliminarIt.getIdContacto() == idCont) {
		        iterator.remove();
		    }
		}
		
		contactos.add(contacto);
		
		proveedor.setContactos(contactos);

		proveedorDao.actualizarProveedor(proveedor);

	}

	@Override
	public List<Contacto> consultarContactosProv(int idProveedor) {
		logger.info("- - - Obtener Contactos del proveedor - - - ");
		return contactoDao.obtenerContactosPorIdProv(idProveedor);
	}
	
	@Override
	public Contacto consultarContactoPorId (int idContacto){
		logger.info("- - - Obtener Contacto - - - ");
		return contactoDao.obtenerContactoPorId(idContacto);
	}

	@Override
	public void  eliminarContacto(int idContacto, int idProv) {
		
		logger.info("- - - Eliminar Contacto - - - " + idContacto);
		

		Proveedor prov = proveedorDao.obtenerProveedorPorId(idProv);
		Contacto contactoEliminar = contactoDao.obtenerContactoPorId(idContacto);
    	
		Set<Contacto> contactos = prov.getContactos();
		
		Iterator<Contacto> iterator = contactos.iterator();
		
		while (iterator.hasNext()) {
			Contacto eliminarIt = iterator.next();
		    if (eliminarIt.getIdContacto() == contactoEliminar.getIdContacto()) {
		        iterator.remove();
		    }
		}
		
		prov.setContactos(contactos);
		
		proveedorDao.actualizarProveedor(prov);
    	
	}
}

