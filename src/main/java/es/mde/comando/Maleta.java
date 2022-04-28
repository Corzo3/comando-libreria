package es.mde.comando;

import java.util.Collection;

public class Maleta {
  private Long id;
  private Collection<ElementoEquipo> elementos;
  private Double pesoEnVacio;

  public Collection<ElementoEquipo> getElementos() {
    return elementos;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Double getPesoEnVacio() {
    return pesoEnVacio;
  }

  public void setElementos(Collection<ElementoEquipo> elementos) {
    this.elementos = elementos;
  }

  public void setPesoEnVacio(Double pesoEnVacio) {
    this.pesoEnVacio = pesoEnVacio;
  }

  public Maleta(Double pesoEnVacio) {
    this.pesoEnVacio = pesoEnVacio;
  }



}
