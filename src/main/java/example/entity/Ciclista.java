package example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ciclista")
public class Ciclista {
	
	@Id
	@Column(name="dorsal")
	private int dorsal;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="foto")
	private String foto;
	
	@Column(name="edad")
	private int edad;
	
	@Column(name="nomeq")
	private String nomeq;

	public Ciclista(int dorsal, String nombre, String foto, int edad, String nomeq) {
		super();
		this.dorsal = dorsal;
		this.nombre = nombre;
		this.foto = foto;
		this.edad = edad;
		this.nomeq = nomeq;
	}
	
	public Ciclista() {
		
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNomeq() {
		return nomeq;
	}

	public void setNomeq(String nomeq) {
		this.nomeq = nomeq;
	}

	
}
