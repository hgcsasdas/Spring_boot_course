package com.hgc.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.hgc.spring.modelo.Empleado;
import com.hgc.spring.repositorios.EmpleadoRepository;
import com.hgc.spring.upload.storage.StorageService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	/**
	 * Este bean se inicia al lanzar la aplicación. Nos permite inicializar el almacenamiento
	 * secundario del proyecto
	 * 
	 * @param storageService Almacenamiento secundario del proyecto
	 * @return
	 */
	@Bean
    CommandLineRunner init(StorageService storageService) {
        return (args) -> {
            storageService.deleteAll();
            storageService.init();
        };
    }
	@Bean
    CommandLineRunner initData(EmpleadoRepository repositorio) {
        return (args) -> {
            Empleado empleado = new Empleado("Pepe", "pepe@gmail.com", "123123123");
            Empleado empleado2 = new Empleado("Argo", "argo@gmail.com", "321321321");
            
            repositorio.save(empleado);
            repositorio.save(empleado2);
            
            repositorio.findAll().forEach(System.out::println);
        };
        
    }
}
