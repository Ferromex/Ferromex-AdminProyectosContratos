package com.ferromex.proyectos.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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

import com.ferromex.proyectos.dominio.Proveedor;
import com.ferromex.proyectos.dominio.TipoObras;
import com.ferromex.proyectos.forma.ProveedorForm;
import com.ferromex.proyectos.servicio.*;
import com.ferromex.proyectos.web.util.Checkbox;

@Controller
public class ProveedoresController {

		private static final Logger logger = LoggerFactory.getLogger(ProveedoresController.class);
		
		@Autowired
	    private ProveedorAdmin proveedorAdmin;

		@Autowired
	    private ZonaAdmin zonaAdmin;

		@Autowired
	    private TipoObraAdmin tipoObraAdmin;

		@RequestMapping(value="/proveedores.htm", method = RequestMethod.GET)
		public  String setProveedor(HttpServletRequest request, HttpServletResponse response,
		   		Model model)
		   		throws ServletException, IOException {
	        
			logger.info(" - - -  Controller Proveedores - - - ");
			
	        model.addAttribute("proveedores", this.proveedorAdmin.obtenerProveedores());
	        model.addAttribute("tipoObras", tipoObraAdmin.obtenerTipoObraProveedor());
	        
	        return "proveedores";

		}
		
		
		@RequestMapping(value="/actualizarproveedor.htm", method = RequestMethod.GET)
		public String setActualizarProveedor(@RequestParam("idProveedor") int idProv, Model model)
		   		throws ServletException, IOException {
	        
			logger.info(" - - -  Controller actualizar Proveedores - - - " + model);
			
			//Se llena la lista con las obras del proveedor llens
			List<TipoObras> tipoObra = this.tipoObraAdmin.obtenerTipoObraProveedor();
			Proveedor proveedor = this.proveedorAdmin.consultarProveedor(idProv);
			Set<TipoObras> tipoObrasProvedor =  proveedor.getObras();
			List<Checkbox> tipoObrasProveedor = new ArrayList<Checkbox>();
			for(TipoObras tipoObras:tipoObra){
				Checkbox check = new Checkbox();
				check.setId(Integer.toString(tipoObras.getIdObra()));
				check.setLabel(tipoObras.getObra());
				check.setDisabled("false");
				check.setValue(Integer.toString(tipoObras.getIdObra()));
				for(TipoObras tipoObrasProv : tipoObrasProvedor){
					if(tipoObras.getIdObra().equals(tipoObrasProv.getIdObra())){
						check.setChecked("checked");
					}
				}
				tipoObrasProveedor.add(check);
			}
	        model.addAttribute("tobrasProv",tipoObra);
	        model.addAttribute("tipoObrasProveedor",tipoObrasProveedor);
	    	model.addAttribute("proveedor", proveedor);
	    	model.addAttribute("zonas", this.zonaAdmin.obtenerZonasProveedor());
	        
	        return "actualizarproveedor";

		}

	    @RequestMapping(value="/actualizarproveedor.htm", method = RequestMethod.POST)
	    public String actualizarProveedorSubmit(ProveedorForm proveedorForm, @RequestParam("idProveedor") int idProv)
	    {
	    	logger.info(" - - -  Controller Proveedores actualizar On Submit - - - " + idProv);
	    	
	        proveedorAdmin.actualizarProveedor(proveedorForm, idProv);
	        
	        return "redirect:/proveedores.htm";
	    }
		
	    
	@RequestMapping(value = "/detalleproveedor.htm", method = RequestMethod.GET)
	public String detalleProveedorSubmit(@RequestParam("idProveedor") int idProv,Model model) {
		logger.info(" - - -  Controller Proveedores detalle On Submit - - - "
				+ idProv);
		logger.info(" - - -  Controller actualizar Proveedores - - - " + model);
		//Se llena la lista con las obras del proveedor llens
		List<TipoObras> tipoObra = this.tipoObraAdmin.obtenerTipoObraProveedor();
		Proveedor proveedor = this.proveedorAdmin.consultarProveedor(idProv);
		Set<TipoObras> tipoObrasProvedor =  proveedor.getObras();
		List<Checkbox> tipoObrasProveedor = new ArrayList<Checkbox>();
		for(TipoObras tipoObras:tipoObra){
			Checkbox check = new Checkbox();
			check.setId(Integer.toString(tipoObras.getIdObra()));
			check.setLabel(tipoObras.getObra());
			check.setDisabled("false");
			check.setValue(Integer.toString(tipoObras.getIdObra()));
			for(TipoObras tipoObrasProv : tipoObrasProvedor){
				if(tipoObras.getIdObra().equals(tipoObrasProv.getIdObra())){
					check.setChecked("checked");
				}
			}
			tipoObrasProveedor.add(check);
		}
        model.addAttribute("tobrasProv",tipoObra);
        model.addAttribute("tipoObrasProveedor",tipoObrasProveedor);
    	model.addAttribute("proveedor", proveedor);
    	model.addAttribute("zonas", this.zonaAdmin.obtenerZonasProveedor());
		return "detalleproveedor";
	}
	    
	    @RequestMapping(value="/eliminarproveedor.htm", method = RequestMethod.GET)
	    public String setEliminarProveedor(@RequestParam("idProveedor") int idProv)
	    {
	    	logger.info(" - - -  Controller Eliminar Proveedor - - - ");
	    	
	        proveedorAdmin.eliminarProveedor(idProv);

	        return "redirect:/proveedores.htm";
	    }

	    @RequestMapping(value="/nuevoproveedor.htm", method = RequestMethod.POST)
	    public String nuevoProveedorSubmit(ProveedorForm proveedorForm, Model myModel)
	    {
	    	logger.info(" - - -  Controller Nuevo Proveedor  On Submit - - - ");
	    	
			proveedorAdmin.crearProveedor(proveedorForm);	    	
	        
	        return "redirect:/proveedores.htm";
	    }

	    @RequestMapping(value="/nuevoproveedor.htm", method = RequestMethod.GET)
	    protected String setNuevoProveedor(Model model) throws ServletException {
	    	
	    	logger.info(" - - -  Controller Nvo Proveedor  GET - - - ");

	    	model.addAttribute("zonas", this.zonaAdmin.obtenerZonasProveedor());
	    	model.addAttribute("obrasProv", this.tipoObraAdmin.obtenerTipoObraProveedor());
	        
	        return "nuevoproveedor";
	    }
}
