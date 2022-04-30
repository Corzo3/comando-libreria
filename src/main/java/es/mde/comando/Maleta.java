package es.mde.comando;

import java.util.Collection;

public interface Maleta {

	Collection<ElementoEquipo> getElementos();

	Double getPesoEnVacio();

	void setElementos(Collection<ElementoEquipo> elementos);

	void setPesoEnVacio(Double pesoEnVacio);
	
	Double addPeso(ElementoEquipo elemento);
}
