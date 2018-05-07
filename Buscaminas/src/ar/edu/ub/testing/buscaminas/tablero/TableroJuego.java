package ar.edu.ub.testing.buscaminas.tablero;

import ar.edu.ub.testing.buscaminas.modelo.Coordenadas;
import ar.edu.ub.testing.buscaminas.modelo.ModoDeJuego;
import ar.edu.ub.testing.buscaminas.mododejuego.ModoDeJuegoSupervivencia;
import ar.edu.ub.testing.util.Consola;

public class TableroJuego {
	private ModoDeJuego modoDeJuego;
	private Tablero tablero;
		
	public TableroJuego(ModoDeJuego modoDeJuego, Tablero tablero) {
		this.setModoDeJuego(modoDeJuego);
		this.setTablero(tablero);		
	}

	public ModoDeJuego getModoDeJuego() {
		return modoDeJuego;
	}

	private void setModoDeJuego(ModoDeJuego modoDeJuego) {
		this.modoDeJuego = modoDeJuego;
	}

	public Tablero getTablero() {
		return tablero;
	}

	private void setTablero(Tablero tablero) {
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

	public static TableroJuego crearTablero(ModoDeJuegoSupervivencia modoDeJuego, Tablero tablero) {
		return new TableroJuego( modoDeJuego, tablero);
	}
}
