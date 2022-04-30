package es.mde.comando;

import java.time.LocalDate;

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
}
