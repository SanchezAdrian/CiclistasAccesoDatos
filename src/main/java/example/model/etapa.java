package example.model;

import org.springframework.lang.NonNull;

public class etapa {
	
	@NonNull
	private int netapa;
	
	@NonNull 
	private int km;
	
	@NonNull
	private String salida;
	
	@NonNull
	private String llegada;
	
	@NonNull 
	private int dorsal;
	
	public etapa() {}
	
	public etapa(int netapa, int km, String salida, String llegada, int dorsal) {
		super();
		this.netapa = netapa;
		this.km = km;
		this.salida = salida;
		this.llegada = llegada;
		this.dorsal = dorsal;
	}

	public int getNetapa() {
		return netapa;
	}

	public void setNetapa(int netapa) {
		this.netapa = netapa;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public String getSalida() {
		return salida;
	}

	public void setSalida(String salida) {
		this.salida = salida;
	}

	public String getLlegada() {
		return llegada;
	}

	public void setLlegada(String llegada) {
		this.llegada = llegada;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	
	
	
	

}
 