package com.tienda.controlador;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tienda.modelo.Orden;
import com.tienda.modelo.Producto;
import com.tienda.servicio.OrdenServicio;
import com.tienda.servicio.ProductoServicio;
import com.tienda.servicio.UsuarioServicio;



@Controller
@RequestMapping("/administrador")
public class AdministradorControlador {


	@Autowired
	private ProductoServicio productoServicio;
	
	@Autowired
	private UsuarioServicio usuarioServicio;
	
	@Autowired
	private OrdenServicio ordensServicio;
	
	private Logger logg= LoggerFactory.getLogger(AdministradorControlador.class);

	@GetMapping("")
	public String home(Model model) {

		List<Producto> productos = productoServicio.findAll();
		model.addAttribute("productos", productos);


		return "administrador/home";
	}
	
	@GetMapping("/usuarios")
	public String usuarios(Model model) {
		model.addAttribute("usuarios", usuarioServicio.findAll());
		return "administrador/usuarios";
	}
	
	@GetMapping("/ordenes")
	public String ordenes(Model model) {
		model.addAttribute("ordenes", ordensServicio.findAll());
		return "administrador/ordenes";
	}
	
	@GetMapping("/detalle/{id}")
	public String detalle(Model model, @PathVariable Integer id) {
		logg.info("Id de la orden {}",id);
		Orden orden= ordensServicio.findById(id).get();
		
		model.addAttribute("detalles", orden.getDetalle());
		
		return "administrador/detalleorden";
	}
}
