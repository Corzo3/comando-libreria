package es.mde.comando;

public class MaletaCabinaImpl extends Maleta implements MaletaCabina {

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

}
