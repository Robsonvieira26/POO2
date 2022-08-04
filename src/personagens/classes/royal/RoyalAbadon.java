package personagens.classes.royal;

import personagens.classes.Abadon;
import state.EstadoNormal;

public class RoyalAbadon extends Abadon {
  public RoyalAbadon() {
    setNome("RoyalAbadon");
    setVida(250);
    setEscudoOuro(0);
    setEscudoPrata(0);
    setEscudoBronze(0);
    setEstado(new EstadoNormal(this));
  }

}
