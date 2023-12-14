package com.hgc.secondhandmarket.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hgc.secondhandmarket.modelo.Compra;
import com.hgc.secondhandmarket.modelo.Usuario;

public interface CompraRepository extends JpaRepository<Compra, Long>{

	List<Compra> findByPropietario(Usuario propietario);
	
}
