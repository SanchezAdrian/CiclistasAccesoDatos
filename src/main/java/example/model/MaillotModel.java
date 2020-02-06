package example.model;


import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

public class MaillotModel {
	
	@NonNull
	@Size(min=3,max=3)
	private String codigo;
	
	@NonNull
	private String tipo;
	
	@NonNull
	private String color;
	
	@NonNull
	private int premio;
	
	

	public MaillotModel(@Size(min = 3, max = 3) String codigo, String tipo, String color, int premio) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.color = color;
		this.premio = premio;
	}
	
	public MaillotModel() {}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPremio() {
		return premio;
	}

	public void setPremio(int premio) {
		this.premio = premio;
	}
	

}
