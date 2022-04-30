package es.mde.comando;

public class MaletaCabinaImpl extends MaletaImpl implements MaletaCabina {

	private Integer altura;
	private Integer anchura;
	private Integer profundidad;

	@Override
	public Integer getAltura() {
		return altura;
	}

	@Override
	public Integer getAnchura() {
		return anchura;
	}

	@Override
	public Integer getProfundidad() {
		return profundidad;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public void setAnchura(int anchura) {
		this.anchura = anchura;
	}

	public void setProfundidad(int profundidad) {
		this.profundidad = profundidad;
	}

	@Override
	public void addElemento(ElementoEquipo elemento) {
		getElementos().add(elemento);

	}

	@Override
	public Double addPeso(ElementoEquipo elemento) { //este método no está revisado
		addElemento(elemento);
		Double pesoTotal = .0;
		for (ElementoEquipo element : getElementos()) {
			pesoTotal += element.getPeso();

		}
		return pesoTotal;
	}
}
