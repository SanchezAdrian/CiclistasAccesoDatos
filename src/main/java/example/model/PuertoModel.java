package example.model;

import org.springframework.lang.NonNull;

public class PuertoModel {
	
	@NonNull
	private String nompuerto;
	
	@NonNull
	private int altura;
	
	@NonNull
	private String categoria;
	
	@NonNull
	private int pendiente;
	
	@NonNull 
	private int netapa;
	
	@NonNull
	private int dorsal;
	
	public PuertoModel() {}

	public PuertoModel(String nompuerto, int altura, String categoria, int pendiente, int netapa, int dorsal) {
		super();
		this.nompuerto = nompuerto;
		this.altura = altura;
		this.categoria = categoria;
		this.pendiente = pendiente;
		this.netapa = netapa;
		this.dorsal = dorsal;
	}

	public String getNompuerto() {
		return nompuerto;
	}

	public void setNompuerto(String nompuerto) {
		this.nompuerto = nompuerto;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getPendiente() {
		return pendiente;
	}

	public void setPendiente(int pendiente) {
		this.pendiente = pendiente;
	}

	public int getNetapa() {
		return netapa;
	}

	public void setNetapa(int netapa) {
		this.netapa = netapa;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

}
