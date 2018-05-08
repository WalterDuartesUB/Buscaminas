package ar.edu.ub.testing.buscaminas.modelo;

import ar.edu.ub.testing.buscaminas.celda.Bomba;

public abstract class ModoDeJuego {
	private boolean terminoJuego;
	private boolean terminoTurno;
	
	public ModoDeJuego(){
		this.setTerminoJuego( false );
		this.setTerminoTurno( false );
	}
		
	//Cada modo de juego tiene que actualizar su estado basado en lo que reciba
	public abstract void actualizarEstadoJuego(Bomba bomba);
	
	public boolean terminoJuego() {
		return terminoJuego;
	}
	
	protected void setTerminoJuego(boolean terminoJuego) {
		this.terminoJuego = terminoJuego;
	}
	public boolean tengoQueCambiarDeTurno() {
		return terminoTurno;
	}
	
	protected void setTerminoTurno(boolean terminoTurno) {
		this.terminoTurno = terminoTurno;
	}

}
