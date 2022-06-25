package com.tienda.servicioImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.modelo.Usuario;
import com.tienda.repositorio.UsuarioRepositorio;
import com.tienda.servicio.UsuarioServicio;

@Service
public class UsuarioServicioImpl implements UsuarioServicio {

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;

	@Override
	public Optional<Usuario> findById(Integer id) {
		return usuarioRepositorio.findById(id);
	}

	@Override
	public Usuario save(Usuario usuario) {
		return usuarioRepositorio.save(usuario);
	}

	@Override
	public Optional<Usuario> findByEmail(String email) {
		return usuarioRepositorio.findByEmail(email);
	}

	@Override
	public List<Usuario> findAll() {
		return usuarioRepositorio.findAll();
	}

}
