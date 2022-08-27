package ar.unlam.edu.pb2;

public class Cerradura {
	private Integer clave;
	private Integer cantidadIntentos;
	private Boolean estado;

	public Cerradura(Integer clave, Integer cantidadIntentos) {
		this.clave = clave;
		this.cantidadIntentos = cantidadIntentos;
		this.estado = false;
	}

	public boolean consultaEstadoCerradura() {
		if (this.estado != false)
			return true;
		return false;
	}
	
	public boolean abrirCerradura (Integer clave) {
		if(this.clave.equals(clave)) {
			this.cantidadIntentos++;
			return true;
		}

		return false;
	}
	
}
