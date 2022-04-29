package es.mde.comando;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Maleta  {

	private Collection<ElementoEquipo> elementos = new ArrayList<ElementoEquipo>();
	private Double pesoEnVacio;

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

}
