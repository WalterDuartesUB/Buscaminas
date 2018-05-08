package ar.edu.ub.testing.buscaminas.mododejuego;

import ar.edu.ub.testing.buscaminas.celda.ContenidoBomba;
import ar.edu.ub.testing.buscaminas.modelo.ModoDeJuego;

public class ModoDeJuegoSupervivencia extends ModoDeJuego {
	
	public ModoDeJuegoSupervivencia() {
		super();
	}
	
	@Override
	public void actualizarEstadoJuego(ContenidoBomba bomba) {
		// Pise una bomba, tengo que terminar el turno y el juego
		this.setTerminoJuego( true );
		this.setTerminoTurno( true );
	}

}
