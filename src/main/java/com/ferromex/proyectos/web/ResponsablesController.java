package com.ferromex.proyectos.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ferromex.proyectos.servicio.ResponsableAdmin;

@Controller

public class ResponsablesController {

		private static final Logger logger = LoggerFactory.getLogger(ResponsablesController.class);
		
		@Autowired
	    private ResponsableAdmin gestorResponsable;
		
		@RequestMapping(value="/consultarGestores.htm")
		public  String setConsultarGestores(HttpServletRequest request, HttpServletResponse response,
		   		Model model)
		   		throws ServletException, IOException {
	        
			logger.info(" - - -  Controller Responsables - - - ");
	
	        model.addAttribute("responsables", this.gestorResponsable.obtenerResponsables());
	        
	        return "listarResponsables";

		}
		    
}