package ar.edu.ub.testing.buscaminas.tablero;

import ar.edu.ub.testing.buscaminas.celda.ContenidoBomba;
import ar.edu.ub.testing.buscaminas.celda.Celda;
import ar.edu.ub.testing.buscaminas.modelo.Coordenadas;
import ar.edu.ub.testing.buscaminas.modelo.ModoDeJuego;
import ar.edu.ub.testing.consola.Consola;

public class TableroJuego {
	private ModoDeJuego modoDeJuego;
	private Tablero		tablero;
		
	public TableroJuego(ModoDeJuego modoDeJuego, TableroTemplate tablero) {
		this.setModoDeJuego(modoDeJuego);
		this.setTablero( new Tablero() );	
		
		// TODO Segun la dificultad del modo de juego, hay que distribuir las bombas
		// TODO Esto capaz convenga que este afuera en el constructor estatico y hacer este protegido
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
		// TODO Imprimir el tablero como coresponda
		
	}

	public void voltear(Coordenadas coordenadas) {
		// TODO implementar el cambio de estado de la celda en las coordenadas		
		this.getCelda( coordenadas ).voltear();
		
		// Actualizo el estado de juego para saber si perdi o si tengo que cambiar el turno
		this.getCelda( coordenadas ).actualizarEstadoJuego( this.getModoDeJuego() );		
	}

	private Celda getCelda(Coordenadas coordenadas) {
		// TODO Pedir lo que corresponda a la celda en el tablero
		return new Celda( new ContenidoBomba() );
	}

}
