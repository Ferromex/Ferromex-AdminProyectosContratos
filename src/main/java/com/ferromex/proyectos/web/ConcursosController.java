package com.ferromex.proyectos.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ferromex.proyectos.forma.ConcursoForm;
import com.ferromex.proyectos.servicio.ConcursoAdmin;
import com.ferromex.proyectos.servicio.EstatusProyectoAdmin;
import com.ferromex.proyectos.servicio.ProyectoAdmin;
import com.ferromex.proyectos.servicio.TipoConcursoAdmin;

@Controller
public class ConcursosController {
	
	private static final Logger logger = LoggerFactory.getLogger(ConcursosController.class);

	
	@Autowired
	private ConcursoAdmin concursoAdmin;
	
	@Autowired
	private ProyectoAdmin proyectoAdmin;
	
	@Autowired
	private EstatusProyectoAdmin estatusProyectoAdmin;

	@Autowired
	private TipoConcursoAdmin tipoConcursoAdmin;
	
	@RequestMapping(value="/concursos.htm", method=RequestMethod.GET)
	public String setConcursos(@RequestParam(value = "idProyecto") Integer idProy,Model model){
		
		logger.info("- - -  Concurso GET  - - - " + idProy);
		
		model.addAttribute("proyecto", proyectoAdmin.consultaProyectoPorIdProyecto(idProy));
		model.addAttribute("estProyectos", estatusProyectoAdmin.obtenerEstatusProyecto());
		model.addAttribute("tconcurso", tipoConcursoAdmin.obtenerTipoConcurso());
		
		logger.info("- - -  Modelo concursos GET " + model.toString()+ " - - - ");

		return "concursos";
	
	}

	@RequestMapping(value="/concursos.htm", method=RequestMethod.POST)
	public String actualizarConcurso(ConcursoForm concursoForm, Model model){
		
		logger.info("- - -  Crear Concurso OnSubmit  - - - ");
		
		concursoAdmin.actualizarConcurso(concursoForm);

		model.addAttribute("proyecto", proyectoAdmin.consultaProyectoPorIdProyecto(concursoForm.getIdProyecto()));
		model.addAttribute("estProyectos", estatusProyectoAdmin.obtenerEstatusProyecto());
		model.addAttribute("tconcurso", tipoConcursoAdmin.obtenerTipoConcurso());
		
		logger.info("- - -  Modelo Nuevo Concurso POST " + model.toString()+ " - - - ");

		return "concursos";
	
	}
}
