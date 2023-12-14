package com.hgc.secondhandmarket.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.hgc.secondhandmarket.modelo.Usuario;
import com.hgc.secondhandmarket.repositorios.UsuarioRepository;

@Service
public class UsuarioServicio {
	
	@Autowired
	UsuarioRepository repositorio;
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	
	public Usuario registrar(Usuario u) {
		u.setPassword(passwordEncoder.encode(u.getPassword()));
		return repositorio.save(u);
	}
	
	public Usuario findById(long id) {
		return repositorio.findById(id).orElse(null);
	}
	
	public Usuario buscarPorEmail(String email) {
		return repositorio.findFirstByEmail(email);
	}
	
	

}
