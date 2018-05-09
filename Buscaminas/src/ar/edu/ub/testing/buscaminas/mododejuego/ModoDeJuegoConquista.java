package ar.edu.ub.testing.buscaminas.mododejuego;

import ar.edu.ub.testing.buscaminas.celda.ContenidoBomba;
import ar.edu.ub.testing.buscaminas.modelo.ModoDeJuego;

public class ModoDeJuegoConquista extends ModoDeJuego{

	
	public ModoDeJuegoConquista() {
		super();
	}
	
	@Override
	public void actualizarEstadoJuego(ContenidoBomba bomba) {
		
		
		
		//TODO Encuentra una bomba, sigue jugando 
		this.setTerminoJuego(false);
		
		
		//TODO No encuentra bomba, se termina el turno
		this.setTerminoJuego(true);
		
	}
	
}
