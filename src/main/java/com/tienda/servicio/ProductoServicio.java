package com.tienda.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tienda.modelo.Producto;

@Service
public interface ProductoServicio {
	public Producto save( Producto producto);
	public Optional<Producto> get(Integer id);
	public void update(Producto producto);
	public void delete(Integer id);
	public List<Producto> findAll();
}
