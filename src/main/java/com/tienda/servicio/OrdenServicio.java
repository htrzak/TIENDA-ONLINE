package com.tienda.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tienda.modelo.Orden;
import com.tienda.modelo.Usuario;

@Service
public interface OrdenServicio {
	List<Orden> findAll();
	Optional<Orden> findById(Integer id);
	Orden save (Orden orden);
	String generarNumeroOrden();
	List<Orden> findByUsuario (Usuario usuario);
}
