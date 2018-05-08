package ar.edu.ub.testing.buscaminas.celda;

import ar.edu.ub.testing.buscaminas.modelo.ModoDeJuego;

public class ContenidoBomba extends Contenido{
	@Override
	public void actualizarEstadoJuego(ModoDeJuego modoDeJuego) {
		modoDeJuego.actualizarEstadoJuego( this );
	}
}
