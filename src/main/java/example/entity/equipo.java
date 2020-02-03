package example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "equipo")

public class equipo {
	
	@Id
	@Column(name="nomeq")
	private String dorsal;
	
	@Column(name="director")
	private String director;
	
	@Column(name="logo")
	private int logo;
	

}
