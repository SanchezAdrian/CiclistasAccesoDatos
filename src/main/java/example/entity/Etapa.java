package example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "etapa")

public class Etapa {
	
	@Id
	@Column(name="netapa")
	private int netapa;
	
	@Column(name="km")
	private int km;
	
	@Column(name="salida")
	private String salida;
	
	@Column(name="llegada")
	private String llegada;
	
	@Column(name="dorsal")
	private int dorsal;
	
	
	

}
