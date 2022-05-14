package es.mde.comando;

import java.time.LocalDate;
import java.util.Collection;

public class MaletaBarcoImpl extends Maleta implements MaletaBarco {

	private LocalDate fechaRecogida;

	public LocalDate getFechaRecogida() {
		return fechaRecogida;
	}

	public void setFechaRecogida(LocalDate fechaRecogida) {
		this.fechaRecogida = fechaRecogida;
	}
	
	

	public MaletaBarcoImpl(Collection<ElementoEquipo> elementos, Float pesoEnVacio, LocalDate fechaRecogida) {
		super(elementos, pesoEnVacio);
		this.fechaRecogida = fechaRecogida;
	}

	public MaletaBarcoImpl(Float pesoEnVacio, LocalDate fechaRecogida) {
		super(pesoEnVacio);
		this.fechaRecogida = fechaRecogida;
	}

}

