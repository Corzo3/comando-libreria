package es.mde.comando;

public class ElementoEquipo {

	private String nombre;
	private Float peso;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public ElementoEquipo() {
	}

	public ElementoEquipo(String nombre, Float peso) {
		super();
		this.nombre = nombre;
		this.peso = peso;
	}

	
}
