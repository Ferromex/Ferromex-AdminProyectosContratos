package com.ferromex.proyectos.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ferromex.proyectos.dominio.Contacto;

@Repository(value = "contactoDAO")
public class ContactoDaoImpl implements ContactoDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(ContactoDaoImpl.class);


    @PersistenceContext
    private EntityManager em;
    
    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
	public List<Contacto> obtenerListaContactos() {
    	List <Contacto> contactoList= em.createQuery
    			("select p from " + Contacto.class.getName() +" p order by p.idContacto").getResultList();
    	logger.info(" - - -  Array Contactos vacio - - - " +contactoList.isEmpty());
        return contactoList;
	}

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    public List<Contacto> obtenerContactosPorIdProv(Integer idProveedor) {
		logger.info(" - - - Buscar Contactos del proveedor: " + idProveedor + " - - - ");
		List <Contacto> contactoList= em.createQuery
    		("select p from " + Contacto.class.getName() +" p where p.idProveedor=:idProveedor")
    		.setParameter("idProveedor",idProveedor)
    		.getResultList();
			
		return contactoList;
	}

    @Transactional(readOnly = true)
    public Contacto obtenerContactoPorId(Integer idContacto) {
		logger.info(" - - - Buscar Contacto: " + idContacto + " - - - ");
		Contacto contacto =  (Contacto) em.createQuery
    		("select p from " + Contacto.class.getName() +" p where p.idContacto=:idContacto")
    		.setParameter("idContacto",idContacto)
    		.getSingleResult();
			
		return contacto;
	}
    
}





