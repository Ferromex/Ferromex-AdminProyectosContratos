package com.ferromex.proyectos.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ferromex.proyectos.dominio.ObrasProveedor;

@Repository(value = "obrasProveedorDAO")
public class ObrasProveedorDaoImpl implements ObrasProveedorDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(ObrasProveedorDaoImpl.class);


    @PersistenceContext
    private EntityManager em;
    
    @Transactional(readOnly = false)
	public void guardarObrasProveedor(ObrasProveedor obrasProveedor) {
    	logger.info(" - - -  Iniciando Save obrasProveedor - - - ");
    	em.persist(obrasProveedor);
	}

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
	public List<ObrasProveedor> obtenerObrasPorIdProveedor(Integer idProveedor) {
		logger.info(" - - - Buscar ObrasProveedor: " + idProveedor + " - - - ");
		List <ObrasProveedor> obrasList= em.createQuery
    		("select p from " + ObrasProveedor.class.getName() +" p where p.idProveedor=:idProv")
    		.setParameter("idProv",idProveedor)
    		.getResultList();
			
		return obrasList;
    }

    @Transactional(readOnly = false)
    @SuppressWarnings("unchecked")
    public void eliminarRelacionesProveedor(int idProveedor) {
    	logger.info(" - - - Borrando relacion : " + idProveedor + " - - - ");
    	
    	List <ObrasProveedor> obras= em.createQuery
        		("select p from " + ObrasProveedor.class.getName() +" p where p.idProveedor=:idProv")
        		.setParameter("idProv",idProveedor).
        		getResultList();
    	
    	for (ObrasProveedor obra : obras) {
    		em.remove(obra);
        }

    }
}






