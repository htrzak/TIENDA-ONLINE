package com.tienda.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tienda.modelo.Orden;
import com.tienda.modelo.Usuario;

@Repository
public interface OrdenRepositorio extends JpaRepository<Orden, Integer> {
	List<Orden> findByUsuario (Usuario usuario);

}
