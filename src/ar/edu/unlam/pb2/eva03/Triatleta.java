package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Triatleta extends Deportista implements INadador, ICiclista, ICorredor{
	private TipoDeBicicleta tipoDeBicicleta;
	private String distanciaPreferida;
	private Integer cantidadDeKilometrosEntrenados;
	private String estiloPreferido;

	public Triatleta(int numeroDeSocio, String nombre, String distanciaPreferida, TipoDeBicicleta tipo) {
		super(numeroDeSocio, nombre);
		this.distanciaPreferida = distanciaPreferida;
		this.tipoDeBicicleta = tipo;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		this.cantidadDeKilometrosEntrenados = km;
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		return cantidadDeKilometrosEntrenados;
	}

	@Override
	public String getEstiloPreferido() {
		return estiloPreferido;
	}

	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipoDeBicicleta;
	}

	public void setTipoDeBicicleta(TipoDeBicicleta tipoDeBicicleta) {
		this.tipoDeBicicleta = tipoDeBicicleta;
	}

	public String getDistanciaPreferida() {
		return distanciaPreferida;
	}

	public void setDistanciaPreferida(String distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}
	

}
