package ar.unlam.edu.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCuentaGanado {

	@Test
	public void queSePuedaCrearUnCuentaGanado() {
		CuentaGanado cuentaGanado = new CuentaGanado();
		assertNotNull(cuentaGanado);
	}

	@Test

	public void queSeCreeUnCuentaGanadoConElContadorEnCero() {
		CuentaGanado cuentaGanado = new CuentaGanado();
		Integer valorEsperado = 0;
		Integer valorObtenido = cuentaGanado.getContador();
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void queSeSumaUno() {
		CuentaGanado cuentaGanado = new CuentaGanado();
		Integer valorEsperado = 1;
		cuentaGanado.sumarUno();
		Integer valorObtenido = cuentaGanado.getContador();
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void queSeReiniciaPasandoElLimite() {
		CuentaGanado cuentaGanado = new CuentaGanado();
		Integer valorEsperado = 0;
		for (int i = 0; i < 10; i++) {
			cuentaGanado.sumarUno();
		}
		Integer valorObtenido = cuentaGanado.getContador();
		assertEquals(valorEsperado, valorObtenido);

	}

	@Test
	public void queSeReinicieElCuentaGanado() {
		CuentaGanado cuentaGanado = new CuentaGanado();
		Integer valorEsperado = 0;
		cuentaGanado.sumarUno();
		cuentaGanado.reiniciarLimite();
		Integer valorObtenido = cuentaGanado.getContador();
		assertEquals(valorEsperado, valorObtenido);
	}

}
