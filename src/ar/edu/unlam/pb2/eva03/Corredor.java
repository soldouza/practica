package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;

public class Corredor extends Deportista implements ICorredor{
	private Integer cantidadDeKilometrosEntrenados;
	private Integer distanciaPreferida;

	public Corredor(int numeroDeSocio, String nombre, Integer distanciaPreferida) {
		super(numeroDeSocio, nombre);
		this.distanciaPreferida = distanciaPreferida;
	}
	
	public Integer getCantidadDeKilometrosEntrenados() {
		return cantidadDeKilometrosEntrenados;
	}


	public void setCantidadDeKilometrosEntrenados(Integer cantidadDeKilometrosEntrenados) {
		this.cantidadDeKilometrosEntrenados = cantidadDeKilometrosEntrenados;
	}


	public Integer getDistanciaPreferida() {
		return distanciaPreferida;
	}


	public void setDistanciaPreferida(Integer distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}

}
