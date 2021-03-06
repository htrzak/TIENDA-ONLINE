package com.tienda.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tienda.modelo.DetalleOrden;

@Repository
public interface DetalleOrdenRepositorio extends JpaRepository<DetalleOrden, Integer> {

}
