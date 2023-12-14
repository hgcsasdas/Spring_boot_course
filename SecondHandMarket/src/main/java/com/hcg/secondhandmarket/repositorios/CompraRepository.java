package com.hcg.secondhandmarket.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcg.secondhandmarket.modelo.Compra;
import com.hcg.secondhandmarket.modelo.Usuario;

public interface CompraRepository extends JpaRepository<Compra, Long>{

	List<Compra> findByPropietario(Usuario propietario);
	
}
