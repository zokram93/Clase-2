package ar.unlam.edu.pb2;

public class Cerradura {
	private Integer claveApertura;
	private Integer cantidadDeIntentosQueLaBloquean;
	private Integer cantidadDeIntentosHechos;
	private Boolean estado;

	public Cerradura(Integer clave, Integer cantidadIntentos) {
		this.claveApertura = clave;
		this.cantidadDeIntentosQueLaBloquean = cantidadIntentos;
		this.cantidadDeIntentosHechos=0;
		this.estado = false;
	}

	public boolean consultaEstadoCerradura() {
		if (this.estado != false)
			return true;
		return false;
	}
	
	public boolean abrirCerradura (Integer clave) {
		if(this.claveApertura.equals(clave)&&fueBloqueada()) {
			this.estado = true;
			return true;
		}
		else {
			this.cantidadDeIntentosHechos++;
			return false;
		}
	}
		
	public boolean fueBloqueada () {
		if(this.cantidadDeIntentosHechos!=this.cantidadDeIntentosQueLaBloquean) {
			return true;
		}
			else {
				return false;	
			}
		}
	public void cerrarCerradura () {
		if (this.estado!=false) {
			this.estado=false;
		}
	}
	public Integer getIntentos() {
		return cantidadDeIntentosHechos;
	}
	


	}
	

