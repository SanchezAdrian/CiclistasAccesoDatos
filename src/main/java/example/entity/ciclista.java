package example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ciclista")
public class ciclista {
	
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

}
