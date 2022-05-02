package es.mde.comando;

import java.util.ArrayList;
import java.util.Collection;

public abstract class MaletaImpl implements Maleta {


	private Collection<ElementoEquipo> elementos;
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
	

	public MaletaImpl(Double pesoEnVacio) {
		super();
		this.pesoEnVacio = pesoEnVacio;
	}

	public MaletaImpl(Collection<ElementoEquipo> elementos, Double pesoEnVacio) {
		super();
		this.elementos = elementos;
		this.pesoEnVacio = pesoEnVacio;
	}

	public MaletaImpl() {
		this.elementos = new ArrayList<ElementoEquipo>();
	}

	public void addElemento(ElementoEquipo elemento) {
		getElementos().add(elemento);
	}

}
