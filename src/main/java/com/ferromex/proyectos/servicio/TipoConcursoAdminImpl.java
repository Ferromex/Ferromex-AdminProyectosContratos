package com.ferromex.proyectos.servicio;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferromex.proyectos.dominio.TipoConcurso;
import com.ferromex.proyectos.repositorio.TipoConcursoDAO;

@Service
public class TipoConcursoAdminImpl implements TipoConcursoAdmin{

	private static final long serialVersionUID = 1L;

	private static final Logger logger = LoggerFactory.getLogger(TipoObraAdminImpl.class);
	
    
    @Autowired
    private TipoConcursoDAO tipoConcursoDao;

    public void setTipoConcursoDao(TipoConcursoDAO tipoConcursoDao) {
        this.tipoConcursoDao = tipoConcursoDao;
    }

	@Override
	public List<TipoConcurso> obtenerTipoConcurso() {
			logger.info("- - - Obtener Tipo de Concurso - - - ");
		return tipoConcursoDao.obtenerListaTipoConcurso();
	}

}


