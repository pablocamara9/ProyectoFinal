package com.salesianostriana.dam.proyectofinal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.proyectofinal.model.Jugador;
import com.salesianostriana.dam.proyectofinal.repos.JugadorRepository;

@Service
public class JugadorService {
	
	private JugadorRepository jugadorRepository;
	
	public JugadorService(JugadorRepository repo) {
		this.jugadorRepository = repo;
	}
	
	/**
	 * Añade un jugador
	 * 
	 * @param j El jugador que se va a añadir
	 * @return El jugador ya añadido
	 */
	public Jugador add(Jugador j) {
		return jugadorRepository.save(j);
	}
	
	/**
	 * Edita un jugador, si no existe, añade uno
	 * 
	 * @param j El jugador que se va a añadir
	 * @return El jugador ya añadido
	 */
	public Jugador edit(Jugador j) {
		return jugadorRepository.save(j);
	}
	
	/**
	 * Elimina un jugador
	 * 
	 * @param j El jugador que se va a eliminar
	 */
	public void delete(Jugador j){
		jugadorRepository.delete(j);
	}

	/**
	 * Elimina un jugador por su id
	 * 
	 * @param id El id del jugador a eliminar
	 */
	public void deleteById(long id) {
		jugadorRepository.deleteById(id);
	}
	
	/**
	 * Devuelve todos los jugadores
	 * 
	 * @return Una lista con todos los jugadores
	 */
	public List<Jugador> findAll(){
		return jugadorRepository.findAll();
	}
	
	/**
	 * Devuelve un jugador, buscando por su id
	 * 
	 * @param id El id del jugador a buscar
	 * @return El jugador encontrado por su id o null en caso de que no se encuentre
	 */
	public Jugador findById(long id) {
		return jugadorRepository.findById(id).orElse(null);
	}
	
	
	
	
}
