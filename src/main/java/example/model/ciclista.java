package example.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

public class ciclista {
	
	@NonNull
	@Size(min=2,max=8)
	private String nombre;
	
	@NonNull
	@Min(18)
	private int edad;
	
	public ciclista(@Size(min = 2, max = 8) String nombre, @Min(18) int edad, int dorsal, String foto, String nomeq) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dorsal = dorsal;
		this.foto = foto;
		Nomeq = nomeq;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getNomeq() {
		return Nomeq;
	}

	public void setNomeq(String nomeq) {
		Nomeq = nomeq;
	}

	@NonNull
	private int dorsal;
	
	private String foto;
	
	@NonNull
	private String Nomeq;
	
	public ciclista() {}
	
	
	
	
	
}
