package com.hgc.secondhandmarket.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hgc.secondhandmarket.modelo.Compra;
import com.hgc.secondhandmarket.modelo.Producto;
import com.hgc.secondhandmarket.modelo.Usuario;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

	List<Producto> findByPropietario(Usuario propietario);
	
	List<Producto> findByCompra(Compra compra);
	
	List<Producto> findByCompraIsNull();
	
	List<Producto> findByNombreContainsIgnoreCaseAndCompraIsNull(String nombre);
	
	List<Producto> findByNombreContainsIgnoreCaseAndPropietario(String nombre, Usuario propietario);
	
}
