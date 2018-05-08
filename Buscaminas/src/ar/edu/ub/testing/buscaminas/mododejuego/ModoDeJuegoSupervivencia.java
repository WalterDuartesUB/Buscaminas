package ar.edu.ub.testing.buscaminas.mododejuego;

import ar.edu.ub.testing.buscaminas.celda.Bomba;
import ar.edu.ub.testing.buscaminas.modelo.ModoDeJuego;

public class ModoDeJuegoSupervivencia extends ModoDeJuego {
	
	public ModoDeJuegoSupervivencia() {
		super();
	}
	
	@Override
	public void actualizarEstadoJuego(Bomba bomba) {
		// Pise una bomba, tengo que terminar el turno y el juego
		this.setTerminoJuego( true );
		this.setTerminoTurno( true );
	}

}
