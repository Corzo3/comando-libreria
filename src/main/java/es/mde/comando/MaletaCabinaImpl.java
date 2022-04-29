package es.mde.comando;

public class MaletaCabinaImpl extends Maleta implements MCabina {

	private int altura;
	private int anchura;
	private int profundidad;

	public int getAltura() {
		return altura;
	}

	public int getAnchura() {
		return anchura;
	}

	public int getProfundidad() {
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
