package com.ferromex.proyectos.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ferromex.proyectos.dominio.Proyecto;
import com.ferromex.proyectos.forma.ProyectoForm;
import com.ferromex.proyectos.servicio.*;


@Controller
public class ProyectoController {

		private static final Logger logger = LoggerFactory.getLogger(ProyectoController.class);
		
		@Autowired
	    private DivisionAdmin divisionAdmin;

		@Autowired
	    private EmpresaAdmin empresaAdmin;

		@Autowired
	    private TipoObraAdmin tipoObrasAdmin;

		@Autowired
	    private OrigenProyectoAdmin origenProyectoAdmin;
		
		@Autowired
	    private ProyectoAdmin proyectoAdmin;

		@Autowired
	    private ConcursoAdmin concursoAdmin;
		
		@Autowired
	    private EstatusProyectoAdmin estatusProyectoAdmin;

		@Autowired
	    private TipoConcursoAdmin tipoConcursoAdmin;

		@RequestMapping(value="/proyectos.htm", method = RequestMethod.GET)
	    public String setProyectos(Model model)
	    {
	    	logger.info(" - - -  Controller Proyectos - - - ");
        
	        model.addAttribute("empresas", this.empresaAdmin.obtenerEmpresas());
	        model.addAttribute("tobras", this.tipoObrasAdmin.obtenerTipoObraProveedor());
	        model.addAttribute("origen", this.origenProyectoAdmin.obtenerOrigenProyecto());
	        model.addAttribute("divisiones", this.divisionAdmin.obtenerDivisiones());
	        model.addAttribute("proyectos", this.proyectoAdmin.obtenerProyectos());
	        
	        logger.info(" - - -  Controller Proyectos - - - " + model.toString());
	        
	        return "proyectos";
	        
	    }

		@RequestMapping(value="/nuevoproyecto.htm", method = RequestMethod.GET)
	    public String setNuevoProyecto(Model model)
	    {
	    	logger.info(" - - -  Controller Nuevo Proyectos - - - ");
	    	
	        model.addAttribute("empresas", this.empresaAdmin.obtenerEmpresas());
	        model.addAttribute("tobras", this.tipoObrasAdmin.obtenerTipoObraProveedor());
	        model.addAttribute("origen", this.origenProyectoAdmin.obtenerOrigenProyecto());
	        model.addAttribute("divisiones", this.divisionAdmin.obtenerDivisiones());
	        
	        return "nuevoproyecto";
	        
	    }

		@RequestMapping(value="/nuevoproyecto.htm", method = RequestMethod.POST)
	    public String nuevoProyectoSubmit(ProyectoForm proyectoForm, Model model)
	    {
	    	logger.info(" - - -  Controller Nuevo Proyecto  On Submit - - - ");
	    	
	    	/**if (result.hasErrors()) {
	            return "increaseprice";
	        }**/
	    	
	    	proyectoAdmin.crearProyecto(proyectoForm);
	    	
	        return "redirect:/proyectos.htm";
	    }

		@RequestMapping(value="/registrarFechas.htm", method=RequestMethod.GET)
		public String registrarFechas(@RequestParam(value="idProyecto")Integer idProy, Model model,
				RedirectAttributes redirectAttrs){
			
			logger.info("- - -  Registro de Fechas GET - - - ");
			
			Proyecto proyecto = proyectoAdmin.consultaProyectoPorIdProyecto(idProy);
			
			if(proyecto.getFechEstCartaIntencion() == null){
				model.addAttribute("proyecto", proyecto);
				model.addAttribute("estProyectos", estatusProyectoAdmin.obtenerEstatusProyecto());

				logger.info("- - -  Modelo Registrar Fechas Get " + model.toString()+ " - - - ");

				return "registrarfechas";
			}
			
			redirectAttrs.addAttribute("idProyecto", idProy);
			logger.info("- - -  REDIRECT - - - " +redirectAttrs.toString());
			return "redirect:/concursos.htm?idProyecto={idProyecto}";
		
		
		}

		@RequestMapping(value="/registrarFechas.htm", method=RequestMethod.POST)
		public String setRegistrarFechas(ProyectoForm proyectoForm, Model model, RedirectAttributes redirectAttrs){
			
			logger.info("- - -  Registro de Fechas POST - - - ");
			
			proyectoAdmin.actualizarProyecto(proyectoForm);
			
			logger.info("- - -  Model reg fechas POST - - - " + model.toString());
			
			redirectAttrs.addAttribute("idProyecto", proyectoForm.getIdProyecto());
			logger.info("- - -  REDIRECT - - - " +redirectAttrs.toString());
			return "redirect:/concursos.htm?idProyecto={idProyecto}";
		
		}


}
