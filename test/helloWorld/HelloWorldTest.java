package Cronometro;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.co.placona.Cronometro.Cronometro;

public class CronometroTest {
	@Test
	public void testHellowWorld(){
		Cronometro cronometro = new Cronometro();
    cronometro.reiniciar();
		assertEquals("Probar el cronometro en cero", 0, cronometro.mostrarValor());
	}
}
