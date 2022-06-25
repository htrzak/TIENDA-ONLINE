package com.tienda.servicio;

import org.springframework.stereotype.Service;

import com.tienda.modelo.DetalleOrden;

@Service
public interface DetalleOrdenServicio {
	DetalleOrden save (DetalleOrden detalleOrden);
}
