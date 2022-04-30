package es.mde.comando;

import java.time.LocalDate;
import java.util.Iterator;

public class MaletaBarcoImpl extends MaletaImpl implements MaletaBarco {

	private LocalDate fechaRecogida;

	public LocalDate getFechaRecogida() {
		return fechaRecogida;
	}

	public void setFechaRecogida(LocalDate fechaRecogida) {
		this.fechaRecogida = fechaRecogida;
	}

	@Override
	public void addElemento(ElementoEquipo elemento) {
		getElementos().add(elemento);

	}

	@Override
	public Double addPeso(ElementoEquipo elemento) {
		addElemento(elemento);
		Double pesoTotal = .0;
		for (ElementoEquipo element : getElementos()) {
			pesoTotal += element.getPeso();

		}
		return pesoTotal;
	}
}
