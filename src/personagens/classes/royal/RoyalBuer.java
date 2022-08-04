package personagens.classes.royal;

import personagens.classes.Buer;
import state.EstadoNormal;

public class RoyalBuer extends Buer {
  public RoyalBuer() {
    setNome("RoyalBuer");
    setVida(300);
    setEscudoOuro(0);
    setEscudoPrata(0);
    setEscudoBronze(0);
    setEstado(new EstadoNormal(this));
  }
}
