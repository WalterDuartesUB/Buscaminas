package ar.edu.ub.testing.buscaminas.tablero;

import ar.edu.ub.testing.buscaminas.modelo.Coordenadas;
import ar.edu.ub.testing.buscaminas.modelo.ModoDeJuego;
import ar.edu.ub.testing.util.Consola;

public class TableroJuego {
	private ModoDeJuego modoDeJuego;
	private Tablero tablero;

	public ModoDeJuego getModoDeJuego() {
		return modoDeJuego;
	}

	public void setModoDeJuego(ModoDeJuego modoDeJuego) {
		this.modoDeJuego = modoDeJuego;
	}

	public Tablero getTablero() {
		return tablero;
	}

	public void setTablero(Tablero tablero) {
		this.tablero = tablero;
	}

	public boolean terminoJuego() {
		return this.getModoDeJuego().terminoJuego();
	}

	public boolean tengoQueCambiarDeTurno() { 
		return this.getModoDeJuego().tengoQueCambiarDeTurno();
	}

	public void mostrar(Consola consola) {
		// TODO Auto-generated method stub
		
	}

	public void voltear(Coordenadas coordenadas) {
		// TODO Volteo la coordenada
		
		// TODO pido al modo de juego que evalue si sigo jugando segun lo que acabo de voltear
	}
}
