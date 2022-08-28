package ar.unlam.edu.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CerraduraTest {

	@Test
	public void testContraseniaIncorrecta() {
		Cerradura prime = new Cerradura(1234, 3, 111);
		Boolean valorEspero = false;
		Boolean valorObtenido = prime.abrirCerradura(3214);
		assertEquals(valorEspero, valorObtenido);

	}

	@Test
	public void testContraseniaCorrecta() {
		Cerradura prime = new Cerradura(1234, 3, 111);
		Boolean valorEspero = true;
		Boolean valorObtenido = prime.abrirCerradura(1234);
		assertEquals(valorEspero, valorObtenido);

	}

	@Test
	public void testIBloquear() {
		Cerradura prime = new Cerradura(1234, 3, 111);
		Boolean valorEspero = true;
		prime.abrirCerradura(2234);
		prime.abrirCerradura(2234);
		prime.abrirCerradura(2234);
		prime.abrirCerradura(2234);
		Boolean valorObtenido = prime.comprobarEstadoDeBloqueo();
		assertEquals(valorEspero, valorObtenido);
	}

	@Test
	public void testVerSiEstaDesbloqueadoAlEmpezar() {
		Cerradura prime = new Cerradura(1234, 3, 222);
		Boolean valorEspero = false;
		Boolean valorObtenido = prime.comprobarEstadoDeBloqueo();
		assertEquals(valorEspero, valorObtenido);
	}

	@Test
	public void cantidadDeIntentos() {
		Cerradura prime = new Cerradura(1234, 3, 111);
		Integer valorEsperado = 4;
		for (int i = 0; i < 4; i++) {
			prime.abrirCerradura(2234);
		}
		Integer valorObtenido = prime.getIntentos();
		assertEquals(valorEsperado, valorObtenido);
	}
	@Test
	public void comprobarClaveMaestraCorrecta () {
		Cerradura prime = new Cerradura(1234, 3, 111);
		Boolean valorEspero = true;
		for (int i = 0; i < 4; i++) {
			prime.abrirCerradura(2234);
		}
		Boolean valorObtenido = prime.desbloquearCerraduraConCodigoMaestro(111);
		assertEquals(valorEspero, valorObtenido);
		
	}
	@Test
	public void comprobarClaveMaestraIncorrecta () {
		Cerradura prime = new Cerradura(1234, 3, 111);
		Boolean valorEspero = false;
		for (int i = 0; i < 4; i++) {
			prime.abrirCerradura(2234);
		}
		Boolean valorObtenido = prime.desbloquearCerraduraConCodigoMaestro(311);
		assertEquals(valorEspero, valorObtenido);
	}
}
