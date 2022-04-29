package es.mde.comando;

import java.time.LocalDate;

public class MaletaBarcoImpl extends Maleta implements MBarco {

	private LocalDate fechaRecogida;

	public LocalDate getFechaRecogida() {
		return fechaRecogida;
	}

	public void setFechaRecogida(LocalDate fechaRecogida) {
		this.fechaRecogida = fechaRecogida;
	}
}
