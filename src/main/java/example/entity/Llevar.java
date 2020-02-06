package example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="llevar")

public class Llevar {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="dorsal")
	private int dorsal;
	
	@Column(name="netapa")
	private int netapa;
	
	@Column(name="codigo")
	private String codigo;
}
