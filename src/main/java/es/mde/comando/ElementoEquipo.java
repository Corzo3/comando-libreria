package es.mde.comando;

public class ElementoEquipo {

	private String nombre;
	private Double peso;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public ElementoEquipo() {
	}

	public ElementoEquipo(String nombre, Double peso) {
		super();
		this.nombre = nombre;
		this.peso = peso;
	}

	
}
