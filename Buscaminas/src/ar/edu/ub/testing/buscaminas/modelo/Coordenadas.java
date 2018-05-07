package ar.edu.ub.testing.buscaminas.modelo;

public class Coordenadas {
	private int fila;
	private int columna;
	
	public Coordenadas(int fila, int columna) {
		this.setFila(fila);
		this.setColumna(columna);		
	}
	
	public int getFila() {
		return fila;
	}
	
	private void setFila(int fila) {
		this.fila = fila;
	}
	public int getColumna() {
		return columna;
	}
	
	private void setColumna(int columna) {
		this.columna = columna;
	}
	
}
