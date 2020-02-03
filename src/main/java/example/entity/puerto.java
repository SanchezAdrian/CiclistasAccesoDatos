package example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "puerto")

public class puerto {
	
	@Id
	@Column(name="nompuerto")
	private String nompuerto;
	
	@Column(name="altura")
	private int altura;
	
	@Column(name="categoria")
	private String categoria;
	
	@Column(name="pendiente")
	private int pendiente;
	
	@Column(name="netapa")
	private int netapa;
	
	@Column(name="dorsal")
	private int dorsal;
	
	
	

}
