package ar.edu.unlam.pb2.eva03;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Club {
	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;

	public Club(String string) {
		this.nombre = string;
		this.socios = new HashSet<Deportista>();
		this.competencias = new HashMap<String, Evento>();
	}
	
	public Boolean agregarDeportista(Deportista deportista) {
		Boolean seAgrego = true;
		for (Deportista socio : socios) {
			if(socio.getNumeroDeSocio().equals(deportista.getNumeroDeSocio())) {
				return seAgrego = false;
					}
		}
		if(seAgrego) {
		socios.add(deportista);
		}
		return seAgrego;
	}

	public Integer getCantidadSocios() {
		return socios.size();
	}

	public void crearEvento(TipoDeEvento carreraNatacionEnAguasAbiertas, String string) {
		Evento nuevoEvento = new Evento(carreraNatacionEnAguasAbiertas);
		this.competencias.put(string, nuevoEvento);
		
	}

	public Integer inscribirEnEvento(String claveEvento, Deportista deportista) {
		Evento nuevoEvento = this.competencias.get(claveEvento);
		if(this.verificarDeportista(nuevoEvento.getTipo(), deportista)) {
			return nuevoEvento.agregarParticipante(deportista);
		}
		return 0;
	}
	public Boolean verificarDeportista(TipoDeEvento tipo, Deportista deportista) {
		switch(tipo) {
		case CARRERA_5K:
		case CARRERA_10K: 
		case CARRERA_21K:
		case CARRERA_42K:
			return deportista instanceof ICorredor;
		case DUATLON:
			return deportista instanceof ICorredor && deportista instanceof INadador;
		case CARRERA_NATACION_EN_PICINA:
		case CARRERA_NATACION_EN_AGUAS_ABIERTAS:
			return deportista instanceof INadador;
		case TRIATLON_SHORT:
		case TRIATLON_OLIMPICO:
		case TRIATLON_MEDIO:
		case TRIATLON_IRONMAN:
			return deportista instanceof Triatleta;
			default: return false;
		}
		
	}
	
}
