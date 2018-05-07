import ar.edu.ub.testing.buscaminas.modelo.Dificultad;
import ar.edu.ub.testing.buscaminas.modelo.Juego;
import ar.edu.ub.testing.buscaminas.modelo.Jugador;
import ar.edu.ub.testing.buscaminas.mododejuego.ModoDeJuegoSupervivencia;
import ar.edu.ub.testing.buscaminas.tablero.CreadorTablero;
import ar.edu.ub.testing.buscaminas.tablero.Tablero;
import ar.edu.ub.testing.buscaminas.tablero.TableroJuego;
import ar.edu.ub.testing.util.Consola;

public class Aplicacion {
	public static void main(String[] args) {
		// TODO MenuPrincipal
		// TODO Pensar si puede haber accesos directos a las partidas ie: game -m survivor -p 1 -map asd.map = jugar survivor 1 jugador en el mapa asd
		/*
		 * 
		 * ? - Jugar partida
		 * ? - Configuracion
		 * ? - Reglas de juego 
		 * ? - Salir
		 * 
		 */
		
		// TODO MenuJugarPartida
		// TODO Buscar alguna forma de hacer simple ver las reglas de cada modo
		/*
		 * ? - Modo Supervivencia
		 * ? - Modo Carrera 
		 * ? - Modo Conquista
		 *  
		 */
		
		// TODO MenuJugarPartidaSupervivencia
		// TODO como elegir el mapa? usar un paginado?
		/*
		 * Seleccion del modo de jugadores ( p1 , p1 vs p2, etc) 
		 */
		
		// TODO MenuJugarPartidaCarrera		
		// TODO MenuJugarPartidaConquista
		
		///////////////////////////////////////////////////////////////////////
		// Ejemplo de una partida en supervivencia con un solo jugador
		
		// TODO pedir la consola
		// TODO pedir archivo con el template del tablero
		
		Consola        consola = null;		
		Tablero        templateTablero = new Tablero();
		CreadorTablero creadorTablero = new CreadorTablero();
		TableroJuego   tablero = creadorTablero.crearTablero( new ModoDeJuegoSupervivencia(), templateTablero, Dificultad.UN_JUGADOR_FACIL  );
		Jugador[]      jugadores = new Jugador[] { new Jugador( "Jugador 1") };
		
		// Creo una partida
		Juego juego = new Juego( consola, jugadores , tablero);
		
		// Mando a jugar
		juego.jugar();
		
		// TODO pedir el resultado(seguramente vaya a otra clase para analizar)
	}
}
