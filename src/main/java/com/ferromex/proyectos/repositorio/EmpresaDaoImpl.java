package com.ferromex.proyectos.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ferromex.proyectos.dominio.Empresa;

@Repository(value = "empresaDao")
public class EmpresaDaoImpl implements EmpresaDAO {

	private static final Logger logger = LoggerFactory.getLogger(ResponsableDaoImpl.class);
	
    @PersistenceContext
    private EntityManager em;

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
	public List<Empresa> obtenerListaEmpresas() {
    	List <Empresa> listaEmpresa= em.createQuery
    			("select p from " + Empresa.class.getName() +" p order by p.idEmpresa").getResultList();
    	logger.info(" - - -  Array Empresas vacio - - - " +listaEmpresa.isEmpty());
        return listaEmpresa;
	}
}
