package com.ferromex.proyectos.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class LoginController {
		private static final Logger logger = LoggerFactory.getLogger(ContactosController.class);

		@RequestMapping(value = "/login.htm")
		public String mostrarLogin(@RequestParam(value = "esValido", required = false) Integer valido, Model model) {
			logger.info("- - -  Login Controller  - - - ");
			model.addAttribute("esValido",valido);
			return "login";		
		}
		
		@RequestMapping(value = "/error/403.htm")
		public String mostrarError403() {
			logger.info("- - -  Error 403 Controller  - - - ");
			return "error-403";		
		}
}
