package com.ferromex.proyectos.servicio;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferromex.proyectos.dominio.Proyecto;
import com.ferromex.proyectos.forma.ProyectoForm;
import com.ferromex.proyectos.repositorio.ProyectoDAO;

@Service
public class ProyectoAdminImpl implements ProyectoAdmin{

	private static final long serialVersionUID = 1L;

	private static final Logger logger = LoggerFactory.getLogger(ProyectoAdminImpl.class);
	
    
    @Autowired
    private ProyectoDAO proyectoDao;

    public void setProyectoDao(ProyectoDAO proyectoDao) {
        this.proyectoDao = proyectoDao;
    }
    
	@Override
	public int crearProyecto(ProyectoForm proyectoForm) {
		logger.info(" - - -  Metodo Crear Proyecto  " + proyectoForm.toString()+ "- - - ");
		
		Proyecto proyecto = new Proyecto();
		
    	proyecto.setEmpresa(proyectoForm.getEmpresa());
    	proyecto.setNombreProyecto(proyectoForm.getNombreProyecto());
    	proyecto.setNombreCorto(proyectoForm.getNombreCorto());
    	proyecto.setTipoObra(proyectoForm.getTipoObra());
    	proyecto.setOrigenProyecto(proyectoForm.getOrigenProyecto());
    	proyecto.setDivision(proyectoForm.getDivision());
    	proyecto.setFechaRecepcion(proyectoForm.getFechaRecepcion());
    	proyecto.setPresupuesto(proyectoForm.getPresupuesto());
    	proyecto.setElementoPEP(proyectoForm.getElementoPEP());
    	proyecto.setCentroCostos(proyectoForm.getCentroCostos());
    	proyecto.setSolicitudInversion(proyectoForm.getSolicitudInversion());
    	proyecto.setFechaEntregaSAI(proyectoForm.getFechaEntregaSAI());
    	proyecto.setSolicitudSAP(proyectoForm.getSolicitudSAP());
    	proyecto.setInicioEstimado(proyectoForm.getInicioEstimado());
    	proyecto.setFinEstimado(proyectoForm.getFinEstimado());
    	proyecto.setDuracionProy(proyectoForm.getDuracionProy());
    	proyecto.setInicioReal(proyectoForm.getInicioReal());
    	proyecto.setFinReal(proyectoForm.getFinReal());
    	proyecto.setEstatusProyecto(1);
    	

		return proyectoDao.guardarProyecto(proyecto);
		
	}

	@Override
	public List<Proyecto> obtenerProyectos() {
		logger.info("- - - Obtener Proyectos - - - ");
		return proyectoDao.obtenerListaProyectos();
	}

	@Override
	public Proyecto consultaProyectoPorIdProyecto(int idProyecto) {
		return proyectoDao.consultarProyectoPorIdProy(idProyecto);
	}

	@Override
	public void actualizarProyecto(ProyectoForm proyectoform) {
		logger.info("- - - Servicio Actualizar Proyectos - - - ");
		Proyecto proyecto = proyectoDao.consultarProyectoPorIdProy(proyectoform.getIdProyecto());
		
		proyecto.setFechEstInvitacion(proyectoform.getFechaEstInvitacion());
		proyecto.setFechEstVisitaObra(proyectoform.getFechaEstVisitaObra());
		proyecto.setFechEstPreguntas(proyectoform.getFechaEstPreguntas());
		proyecto.setFechEstRespuestas(proyectoform.getFechaEstRespuestas());
		proyecto.setFechEstPropuestas(proyectoform.getFechaEstPropuestas());
		proyecto.setFechEstRevisionTecnica(proyectoform.getFechaEstRevisionTecnica());
		proyecto.setFechEstChecklistTec(proyectoform.getFechaEstChecklistTec());
		proyecto.setFechEstCartaIntencion(proyectoform.getFechaEstCartaIntencion());
		
		proyectoDao.actualizarProyecto(proyecto);
	}

}


