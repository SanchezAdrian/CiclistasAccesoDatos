package example.model;

import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

public class LlevarModel {
	
	@NonNull
	private int dorsal;
	
	@NonNull
	private int netapa;
	
	@NonNull
	@Size(min=3,max=3)
	private String codigo;
	
	public LlevarModel() {}
	
	

	public LlevarModel(int dorsal, int netapa, @Size(min = 3, max = 3) String codigo) {
		super();
		this.dorsal = dorsal;
		this.netapa = netapa;
		this.codigo = codigo;
	}



	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getNetapa() {
		return netapa;
	}

	public void setNetapa(int netapa) {
		this.netapa = netapa;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
