package chain;

import personagens.DanoRecebido;

public class SemEscudo extends Escudo {
  public SemEscudo() {
    super(null);
  }

  public double processaDano(DanoRecebido d) {
    return d.getAtaqueInimigo();
  }

}
