package decorator;

import personagens.DanoCausado;

public abstract class DanoCausadoDecorador extends DanoCausado {
  private DanoCausado danoCausado;

  public DanoCausadoDecorador(DanoCausado danoCausado) {
    this.danoCausado = danoCausado;
  }

  public double getDano() {
    return danoCausado.getDano() * super.getDano();
  }

}
