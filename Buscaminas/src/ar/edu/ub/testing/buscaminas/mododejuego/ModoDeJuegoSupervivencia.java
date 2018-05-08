package ar.edu.ub.testing.buscaminas.mododejuego;

import ar.edu.ub.testing.buscaminas.celda.ContenidoBomba;
import ar.edu.ub.testing.buscaminas.modelo.ModoDeJuego;

public class ModoDeJuegoSupervivencia extends ModoDeJuego {
	
	public ModoDeJuegoSupervivencia() {
		super();
	}
	
	@Override
	public void actualizarEstadoJuego(ContenidoBomba bomba) {
		// Pise una bomba, termina mi turno		
		this.setTerminoTurno( true );
		
		// TODO el juego solo termina si se mueren todos los jugadores o no hay mas minas
		// TODO ver como resolver eso.		
		this.setTerminoJuego( true );
	}

}
