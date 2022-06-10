package chain;

import personagens.Dano;

public class SemEscudo extends Escudo {
  public SemEscudo() {
    super(null);
  }

  public double processaDano(Dano d) {
    return d.getAtaqueInimigo();
  }

}
