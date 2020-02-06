package example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mailot")

public class Maillot {
	
	@Id
	@Column(name="codigo")
	private String codigo;
	
	@Column(name="tipo")
	private String tipo;
	
	@Column(name="color")
	private String color;
	
	@Column(name="premio")
	private int premio;
	
	
	

}
