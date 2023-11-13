package com.hgc.spring.servicios;

import java.util.List;

import com.hgc.spring.modelo.Empleado;

public interface EmpleadoService {
	
	public Empleado add(Empleado e);
	public List<Empleado> findAll();
	public Empleado findById(long id);
	public Empleado edit(Empleado e);

}
