package ar.edu.ub.testing.buscaminas.modelo;

public class Jugador {

	private String alias;
	
	public Jugador(String alias) {
		this.setAlias(alias);
	}

	// Solo el jugador en el juego debe saber su proximo
	// mover esta implementacion a otra clase
	public Jugador getProximoJugador() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

}
