package ar.unlam.edu.pb2;

public class CuentaGanado {
	private Integer contador;
	private Integer limite = 9;

	public CuentaGanado() {
		this.contador = 0;
	}

	public Integer getContador() {
		return this.contador;
	}
	public void setLimite(Integer limite){
		this.limite = limite;
	}

	public void sumarUno() {
		if(this.contador < this.limite){
		this.contador++;
		} else {
			reiniciarLimite();
		}
	}
	
	public void reiniciarLimite(){
			contador = 0;
	}
	

}
