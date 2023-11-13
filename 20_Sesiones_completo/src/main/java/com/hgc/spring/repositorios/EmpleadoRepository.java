package com.hgc.spring.repositorios;


import org.springframework.data.jpa.repository.JpaRepository;

import com.hgc.spring.modelo.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

}
