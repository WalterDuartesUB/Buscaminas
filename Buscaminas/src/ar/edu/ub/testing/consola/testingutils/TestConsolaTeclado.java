package ar.edu.ub.testing.consola.testingutils;

import ar.edu.ub.testing.consola.Consola;
import ar.edu.ub.testing.consola.ConsolaTeclado;
import junit.framework.TestCase;

public class TestConsolaTeclado extends TestCase
{
	public void testVerificarUnicaInstancia()
	{
		Consola consola = ConsolaTeclado.getConsola();
		Consola consola2 = ConsolaTeclado.getConsola();
		
		assertEquals(consola, consola2);
	}
}
