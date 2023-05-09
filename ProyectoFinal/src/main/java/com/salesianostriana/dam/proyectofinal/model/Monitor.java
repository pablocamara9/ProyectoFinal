package com.salesianostriana.dam.proyectofinal.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
 @Data
 @AllArgsConstructor
 @NoArgsConstructor
 @Builder
public class Monitor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String dni;
	private String nombre;
	private String apellidos;
	private int telefono;
	
	public Monitor(String dni, String nombre, String apellidos, int telefono) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
	}
	
}
