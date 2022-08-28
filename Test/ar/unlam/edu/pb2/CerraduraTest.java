package ar.unlam.edu.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CerraduraTest {

	@Test
	public void testContraseniaIncorrecta() {
		Cerradura prime = new Cerradura(1234,3);
		Boolean valorEspero=false;
		Boolean valorObtenido = prime.abrirCerradura(3214);
		assertEquals(valorEspero,valorObtenido);
		
	}
	@Test
	public void testContraseniaCorrecta() {
		Cerradura prime = new Cerradura(1234,3);
		Boolean valorEspero=true;
		Boolean valorObtenido = prime.abrirCerradura(1234);
		assertEquals(valorEspero,valorObtenido);
		
	}
	
	@Test
	public void testIntentosBloquead() {
		Cerradura prime = new Cerradura(1234,3);
	}
}
