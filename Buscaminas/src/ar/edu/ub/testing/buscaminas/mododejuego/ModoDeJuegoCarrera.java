package ar.edu.ub.testing.buscaminas.mododejuego;

import ar.edu.ub.testing.buscaminas.celda.ContenidoBomba;
import ar.edu.ub.testing.buscaminas.modelo.ModoDeJuego;

public class ModoDeJuegoCarrera extends ModoDeJuego{

	@Override
	public void actualizarEstadoJuego(ContenidoBomba bomba) {
		
		
		//TODO Al encontrar una bomba, se termina el turno
		this.setTerminoJuego(true);
		
		
		//TODO No se encontro una bomba, sigue jugando
		this.setTerminoJuego(false);
		
	}
}
