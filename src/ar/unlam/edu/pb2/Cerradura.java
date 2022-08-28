package ar.unlam.edu.pb2;

public class Cerradura {
	private Integer claveApertura;
	private Integer cantidadDeIntentosQueLaBloquean;
	private Integer cantidadDeIntentosHechos;
	private Integer codigoMaestroParaDesbloquear;
	private Boolean bloqueo;
	private Boolean openOff;

	public Cerradura(Integer clave, Integer cantidadIntentos, Integer codigoMaestro) {
		this.claveApertura = clave;
		this.codigoMaestroParaDesbloquear=codigoMaestro;
		this.cantidadDeIntentosQueLaBloquean = cantidadIntentos;
		this.cantidadDeIntentosHechos = 1 ;
		this.openOff = false;
		this.bloqueo = false;
	}

	public boolean consultaEstadoCerradura() {
		return openOff;
	}

	public boolean abrirCerradura(Integer clave) {
		if (seBloqueaSiSuperaLaCantidadDeIntentosHechos()==false) {

			if (this.claveApertura.equals(clave)) {
				this.openOff = true;
				return true;
			} else {
				this.cantidadDeIntentosHechos++;
				return false;
			}
		} else {
			return false;
		}
	}

	public boolean seBloqueaSiSuperaLaCantidadDeIntentosHechos() {
		if (this.cantidadDeIntentosHechos > this.cantidadDeIntentosQueLaBloquean) {
			this.bloqueo = true;
			return true;
		} else {
			return false;
		}
	}

	public void cerrarCerradura() {
		if (this.openOff != false) {
			this.openOff = false;
		}
	}

	public Integer getIntentos() {
		return cantidadDeIntentosHechos;
	}
	
	public boolean desbloquearCerraduraConCodigoMaestro(Integer codigoMaestro) {
		if(this.codigoMaestroParaDesbloquear.equals(codigoMaestro)) {
			this.bloqueo= false;
			this.cantidadDeIntentosHechos=0;
			return true;
		}
			else {
				return false;
			}
		}
	public boolean comprobarEstadoDeBloqueo() {
		return this.bloqueo;
	}
	
}
	


