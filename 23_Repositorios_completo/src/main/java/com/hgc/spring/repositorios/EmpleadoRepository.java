package com.hgc.spring.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hgc.spring.modelo.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long>{
	List<Empleado> findByNombreContainsIgnoreCaseOrEmailContainsIgnoreCaseOrTelefonoContainsIgnoreCase(String nombre, String email, String Telefono);
}
