package es.mde.comando;

public class ElementoEquipo {

	private String nombre;
	private Double peso;

	public String getNombre() {
		return nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public ElementoEquipo(String nombre, Double peso) {
		this.nombre = nombre;
		this.peso = peso;
	}

}
