package com.salesianostriana.dam.proyectofinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Jugador {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String dni;
	private String nombre;
	private String apellidos;
	private int telefono;
	
	/**
	 * 
	 * @param dni
	 * @param nombre
	 * @param apellidos
	 * @param telefono
	 */
	
	public Jugador(String dni, String nombre, String apellidos, int telefono) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
	}
	
	

}
