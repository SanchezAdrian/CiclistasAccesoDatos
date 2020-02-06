package example.model;

import org.springframework.lang.NonNull;

public class EquipoModel {
	
	@NonNull
	private String nomeq;
	
	@NonNull
	private String director;
	
	private String logo;
	
	public EquipoModel() {}

	public EquipoModel(String nomeq, String director, String logo) {
		super();
		this.nomeq = nomeq;
		this.director = director;
		this.logo = logo;
	}

	public String getNomeq() {
		return nomeq;
	}

	public void setNomeq(String nomeq) {
		this.nomeq = nomeq;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}
	
	

}
