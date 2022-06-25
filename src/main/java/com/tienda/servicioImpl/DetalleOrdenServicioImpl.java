package com.tienda.servicioImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.modelo.DetalleOrden;
import com.tienda.repositorio.DetalleOrdenRepositorio;
import com.tienda.servicio.DetalleOrdenServicio;

@Service
public class DetalleOrdenServicioImpl  implements DetalleOrdenServicio {
	
	@Autowired
	private DetalleOrdenRepositorio detalleOrdenRepositorio;

	@Override
	public DetalleOrden save(DetalleOrden detalleOrden) {
		return detalleOrdenRepositorio.save(detalleOrden);
	}

}
