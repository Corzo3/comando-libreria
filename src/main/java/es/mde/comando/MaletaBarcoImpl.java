package es.mde.comando;

import java.time.LocalDate;
import java.util.Collection;

public class MaletaBarcoImpl extends MaletaImpl implements MaletaBarco {

	private LocalDate fechaRecogida;

	public LocalDate getFechaRecogida() {
		return fechaRecogida;
	}

	public void setFechaRecogida(LocalDate fechaRecogida) {
		this.fechaRecogida = fechaRecogida;
	}
	
	

	public MaletaBarcoImpl(Collection<ElementoEquipo> elementos, Double pesoEnVacio, LocalDate fechaRecogida) {
		super(elementos, pesoEnVacio);
		this.fechaRecogida = fechaRecogida;
	}

	public MaletaBarcoImpl(Double pesoEnVacio, LocalDate fechaRecogida) {
		super(pesoEnVacio);
		this.fechaRecogida = fechaRecogida;
	}

	@Override
	public Double addPeso(ElementoEquipo elemento) {
		// TODO Auto-generated method stub
		return null;
	}
}

