package es.mde.comando;

import java.time.LocalDate;

public class MaletaBarco extends Maleta {

	private LocalDate fechaRecogida;

	public LocalDate getFechaRecogida() {
		return fechaRecogida;
	}

	public void setFechaRecogida(LocalDate fechaRecogida) {
		this.fechaRecogida = fechaRecogida;
	}

	public MaletaBarco(Double pesoEnVacio, LocalDate fechaRecogida) {
		super(pesoEnVacio);
		this.fechaRecogida = fechaRecogida;
	}

}
