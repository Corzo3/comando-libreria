package es.mde.comando;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Maleta {

	private Collection<ElementoEquipo> elementos = new ArrayList<>();
	private Float pesoEnVacio;

	public Collection<ElementoEquipo> getElementos() {
		return elementos;
	}

	public Float getPesoEnVacio() {
		return pesoEnVacio;
	}

	public void setElementos(Collection<ElementoEquipo> elementos) {
		this.elementos = elementos;
	}

	public void setPesoEnVacio(Float pesoEnVacio) {
		this.pesoEnVacio = pesoEnVacio;
	}

	public Maleta(Float pesoEnVacio) {
		super();
		this.pesoEnVacio = pesoEnVacio;
	}

	public Maleta(Collection<ElementoEquipo> elementos, Float pesoEnVacio) {
		super();
		this.elementos = elementos;
		this.pesoEnVacio = pesoEnVacio;
	}
	
	public Maleta() {
		
	}
	
	public void addElemento(ElementoEquipo elemento) {
		getElementos().add(elemento);
	}
	
	
}
