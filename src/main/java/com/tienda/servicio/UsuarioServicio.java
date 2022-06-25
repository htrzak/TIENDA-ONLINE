package com.tienda.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tienda.modelo.Usuario;

@Service
public interface UsuarioServicio {
	List<Usuario> findAll();
	Optional<Usuario> findById(Integer id);
	Usuario save (Usuario usuario);
	Optional<Usuario> findByEmail(String email);

}
