package es.mde.comando;

import java.util.Collection;

public class Maleta {

	Collection<ElementoEquipo> elementos;
	Double pesoEnVacio;

	public Collection<ElementoEquipo> getElementos() {
		return elementos;
	}

	public Double getPesoEnVacio() {
		return pesoEnVacio;
	}

	public void setElementos(Collection<ElementoEquipo> elementos) {
		this.elementos = elementos;
	}

	public void setPesoEnVacio(Double pesoEnVacio) {
		this.pesoEnVacio = pesoEnVacio;
	}

	public Maleta(Double pesoEnVacio) {
		this.pesoEnVacio = pesoEnVacio;
	}
	
	
	
	

}
