package personagens.classes.royal;

import personagens.classes.Morningstar;
import state.EstadoNormal;

public class RoyalMorningstar extends Morningstar {
  public RoyalMorningstar() {
    setNome("RoyalMorningstar");
    setVida(350);
    setEscudoOuro(0);
    setEscudoPrata(0);
    setEscudoBronze(0);
    setEstado(new EstadoNormal(this));
  }
}
