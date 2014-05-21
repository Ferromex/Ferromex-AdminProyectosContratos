package com.ferromex.proyectos.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ferromex.proyectos.dominio.DocumentoOficial;
import com.ferromex.proyectos.forma.DocumentoOficialForm;
import com.ferromex.proyectos.servicio.*;

@Controller
public class DocumentosOficController {

		private static final Logger logger = LoggerFactory.getLogger(DocumentosOficController.class);
		
		@Autowired
	    private DocumentoOficialAdmin documentoOficialAdmin;
		
		@Autowired
	    private EmpresaAdmin empresaAdmin;

		@Autowired
	    private ResponsableAdmin responsableAdmin;

		@Autowired
	    private TipoDocAdmin tipoDocAdmin;

		@Autowired
	    private ProveedorAdmin proveedorAdmin;

		@Autowired
	    private ProyectoAdmin proyectoAdmin;

		@RequestMapping(value="/documentosoficiales.htm", method = RequestMethod.GET)
		public String setDocOficiales(HttpServletRequest request, HttpServletResponse response,
		   		Model model)
		   		throws ServletException, IOException {
	        
	        model.addAttribute("docsOficiales", this.documentoOficialAdmin.obtenerDocumentosOficiales());
	        
	        return "docsoficiales";

		}

		@RequestMapping(value="/nuevodocoficial.htm", method = RequestMethod.POST)
	    public String nuevoDocOficialSubmit(DocumentoOficialForm documentoOficialForm, Model model,
		@RequestParam(value="action", required=true) String action)
	    {
	    	logger.info(" - - -  Controller Nuevo Documento  On Submit - - - ");
	    	
	    	if (action.equals("Cancelar")){
	    		return "redirect:/documentosoficiales.htm";
	    	}

	        documentoOficialAdmin.crearDocumentoOficial(documentoOficialForm);
	        
	        return "redirect:/documentosoficiales.htm";
	    }

	    @RequestMapping(value="/nuevodocoficial.htm", method = RequestMethod.GET)
	    protected String setNuevoDocOficial(Model model) throws ServletException {
	    	
	    	logger.info(" - - -  Controller NvoDocOficial  GET - - - ");

	    	model.addAttribute("empresas", this.empresaAdmin.obtenerEmpresas());
	        model.addAttribute("responsables", this.responsableAdmin.obtenerResponsables());
	        model.addAttribute("tipoDoc", this.tipoDocAdmin.obtenerTipoDocumento());
	        model.addAttribute("proveedores", this.proveedorAdmin.obtenerProveedores());
	        model.addAttribute("proyectos", this.proyectoAdmin.obtenerProyectos());
	        
	        return "nuevodocoficial";
	    }


}
