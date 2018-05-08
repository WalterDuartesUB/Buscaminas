package ar.edu.ub.testing.buscaminas.celda;

import ar.edu.ub.testing.buscaminas.modelo.ModoDeJuego;

public class Celda {
	private Contenido contenido;	
	
	public Celda(Contenido contenido) {
		this.setContenido(contenido);
	}
	
	public void actualizarEstadoJuego(ModoDeJuego modoDeJuego){
		this.getContenido().actualizarEstadoJuego( modoDeJuego );
	}

	public void voltear() {
		// TODO Tiene que cambiar el estado a boca arriba
		// TODO deberia recibir el jugador que le cambio el estado para guardarlo
		
	}

	public Contenido getContenido() {
		return contenido;
	}

	public void setContenido(Contenido contenido) {
		this.contenido = contenido;
	}

}
