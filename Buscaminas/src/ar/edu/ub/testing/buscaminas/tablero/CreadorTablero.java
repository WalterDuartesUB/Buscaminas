package ar.edu.ub.testing.buscaminas.tablero;
import ar.edu.ub.testing.buscaminas.modelo.Dificultad;
import ar.edu.ub.testing.buscaminas.mododejuego.ModoDeJuegoSupervivencia;

public class CreadorTablero {
	public TableroJuego crearTablero( ModoDeJuegoSupervivencia modoDeJuego, TableroTemplate templateTablero, Dificultad dificultad ) {
		return new TableroJuego( modoDeJuego, templateTablero );
	}
}
