package com.ferromex.proyectos.web;

import java.io.IOException;

import javax.servlet.ServletException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ferromex.proyectos.dominio.Proveedor;
import com.ferromex.proyectos.forma.ContactoForm;
import com.ferromex.proyectos.servicio.ContactoAdmin;
import com.ferromex.proyectos.servicio.ProveedorAdmin;


/**
 * Handles requests for the application home page.
 */
@Controller
public class ContactosController {

		private static final Logger logger = LoggerFactory.getLogger(ContactosController.class);
		
		@Autowired
	    private ContactoAdmin contactoAdmin;

		@Autowired
	    private ProveedorAdmin proveedorAdmin;
		
		@RequestMapping(value="/contactos.htm", method = RequestMethod.GET)
	    public String setContacto(@RequestParam("idProveedor") int idProv, Model model)
	    {
	    	logger.info(" - - -  Controller Contactos - - - ");
	    	
	    	Proveedor prov = proveedorAdmin.consultarProveedor(idProv);
	    	
	        model.addAttribute("contactos",prov.getContactos());
	        model.addAttribute("proveedor", prov);
	        
	        return "contactos";
	        
	    }
		
		@RequestMapping(value="/nuevocontacto.htm", method = RequestMethod.POST)
	    public String crearContactoSubmit(ContactoForm contactoForm, Model myModel, 
	    		@RequestParam(value="action", required=true) String action)
	    {
	    	logger.info(" - - -  Controller Nuevo Contacto  On Submit - - - " + action);

	    	if (!action.equals("Cancelar")){
	    		contactoAdmin.crearContacto(contactoForm); 
	    	}
	    
	    	return "redirect:/proveedores.htm";

	    }

	    @RequestMapping(value="/nuevocontacto.htm", method = RequestMethod.GET)
	    protected String setNuevoContacto(Model model) 
	    		throws ServletException {
	    	
	    	logger.info(" - - -  Controller Nuevo Contacto  GET - - - ");

	        model.addAttribute("proveedores", this.proveedorAdmin.obtenerProveedores());
	        
	        return "nuevocontacto";
	    }

	    @RequestMapping(value="/actualizarcontacto.htm", method = RequestMethod.GET)
		public  String setActualizaContacto(@RequestParam("idContacto") int idContacto, Model model)
		   		throws ServletException, IOException {
	        
			logger.info(" - - -  Controller actualizar Contactos - - - " + model);
	
	    	model.addAttribute("proveedores", this.proveedorAdmin.obtenerProveedores());
	    	model.addAttribute("contacto", this.contactoAdmin.consultarContactoPorId(idContacto));
	        
	        logger.info(" - - -  MODEL - - - " + model);
	        
	        return "actualizarcontacto";

		}

	    @RequestMapping(value="/actualizarcontacto.htm", method = RequestMethod.POST)
	    public String actualizarContactoSubmit(ContactoForm contactoForm,	@RequestParam("idContacto") int idContacto)
	    {
	    	logger.info(" - - -  Controller Actualizar Contactos On Submit - - - " + idContacto);
	        
	        contactoAdmin.actualizarContacto(contactoForm, idContacto);

	        return "redirect:/proveedores.htm";
	        
	    }
	    
	    @RequestMapping(value="/eliminarcontacto.htm", method = RequestMethod.GET)
	    public String eliminarContacto(@RequestParam("idContacto") int idContacto,
	    		@RequestParam("idProveedor") int idProveedor)
	    {
	    	logger.info(" - - -  Controller Eliminar Contacto - - - ");
	    	
	    	contactoAdmin.eliminarContacto(idContacto, idProveedor);

	    	return "redirect:/proveedores.htm";
	    }

		
}
