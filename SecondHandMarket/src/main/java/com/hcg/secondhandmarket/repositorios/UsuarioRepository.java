package com.hcg.secondhandmarket.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcg.secondhandmarket.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	Usuario findFirstByEmail(String email);

}
