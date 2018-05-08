package ar.edu.ub.testing.buscaminas.celda;

import ar.edu.ub.testing.buscaminas.modelo.ModoDeJuego;

public class Bomba extends Celda{
	public void actualizarEstadoJuego(ModoDeJuego modoDeJuego) {
		modoDeJuego.actualizarEstadoJuego( this );
	}
}
