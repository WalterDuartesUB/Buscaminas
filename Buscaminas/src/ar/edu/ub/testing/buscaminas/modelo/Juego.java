package ar.edu.ub.testing.buscaminas.modelo;

import ar.edu.ub.testing.buscaminas.tablero.TableroJuego;
import ar.edu.ub.testing.consola.Consola;

public class Juego {
	
	private Jugador[] jugadores;
	private TableroJuego tablero;
	
	private Jugador jugadorDeTurno;
	private Consola consola;
	
	public Juego( Consola consola, Jugador[] jugadores, TableroJuego tablero )
	{
		this.setJugadores(jugadores);
		this.setTablero(tablero);
		this.setConsola(consola);
	}
	
	public void jugar() {
		//TODO deberia devolver el resultado del juego ( quien gano o empate )
		
		while( !this.terminoJuego() ) {
			jugarTurno();
			
			if( !this.terminoJuego() )
				this.cambiarTurno();
		}
	}

	private void jugarTurno() {
		while( !this.tengoQueCambiarDeTurno() ) {				
			this.hacerMovimiento( );
		}
	}

	private boolean tengoQueCambiarDeTurno() {
		return this.getTablero().tengoQueCambiarDeTurno();
	}

	private void cambiarTurno() {
		// TODO Auto-generated method stub
		this.setJugadorDeTurno(this.getJugadorDeTurno().getProximoJugador() );
	}

	private boolean terminoJuego() {
		return this.getTablero().terminoJuego();
	}

	private void hacerMovimiento() {				
		Coordenadas coordenadas = this.pedirCoordenadas();
		
		// TODO muestro la celda
		this.getTablero().voltear( coordenadas );
	}

	private Coordenadas pedirCoordenadas() {
		
		Coordenadas  coordenadas = null;
		
		// TODO Mientras que las coordenadas no son validas, pido nuevas
		this.mostrarTablero();
		
		this.getConsola().print("Ingrese las coordenadas a voltear");
		this.getConsola().nextLine();
		
		return coordenadas;
	}

	private void mostrarTablero() {
		this.getTablero().mostrar( this.getConsola() );		
	}

	private Jugador[] getJugadores() {
		return jugadores;
	}

	private void setJugadores(Jugador[] jugadores) {		
		// Esto se tiene que convertir en una lista circular de jugadores
		// para siempre pedir el proximo jugador
		this.jugadores = jugadores;
	}

	private TableroJuego getTablero() {
		return tablero;
	}

	private void setTablero(TableroJuego tablero) {
		this.tablero = tablero;
	}

	private Jugador getJugadorDeTurno() {
		return jugadorDeTurno;
	}

	private void setJugadorDeTurno(Jugador jugadorDeTurno) {
		this.jugadorDeTurno = jugadorDeTurno;
	}

	private Consola getConsola() {
		return consola;
	}

	private void setConsola(Consola consola) {
		this.consola = consola;
	}
	
}
