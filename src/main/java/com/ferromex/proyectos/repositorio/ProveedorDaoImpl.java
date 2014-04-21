package com.ferromex.proyectos.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ferromex.proyectos.dominio.Proveedor;

@Repository(value = "proveedorDAO")
public class ProveedorDaoImpl implements ProveedorDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(ProveedorDaoImpl.class);


    @PersistenceContext
    private EntityManager em;
    
    
    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
	public List<Proveedor> obtenerListaProveedores() {
    	List <Proveedor> proveedorList= em.createQuery
    			("select p from " + Proveedor.class.getName() +" p order by p.idProveedor").getResultList();
    	logger.info(" - - -  Array Proveedores vacio - - - " +proveedorList.isEmpty());

        return proveedorList;
	}

    @Transactional(readOnly = false)
	public void guardarProveedor(Proveedor proveedor) {
    	logger.info(" - - -  Iniciando Save proveedor - - - ");
    	em.persist(proveedor);
	}

    @Transactional(readOnly = false)
	public void actualizarProveedor(Proveedor proveedor) {
    	logger.info(" - - -  Iniciando Actualziar proveedor - - - ");
    	em.merge(proveedor);
	}

    @Transactional(readOnly = true)
	public Proveedor obtenerProveedorPorId(Integer idProveedor) {
		logger.info(" - - - Buscar proveedor - - - " + idProveedor);
		Proveedor proveedor = (Proveedor) em.createQuery
    		("select p from " + Proveedor.class.getName() +" p where p.idProveedor=:idProveedor")
    		.setParameter("idProveedor",idProveedor)
    		.getSingleResult();
			
		return proveedor;
	}
    
    @Transactional(readOnly = false)
	public void eliminarProveedor(Integer idProveedor) {
		logger.info(" - - - Eliminar proveedor - - - " + idProveedor);
		Proveedor proveedor = (Proveedor) em.createQuery
	    		("select p from " + Proveedor.class.getName() +" p where p.idProveedor=:idProveedor").setParameter("idProveedor",idProveedor).getSingleResult();

		em.remove(proveedor);
	}
    
	

}




