package personagens.classes.royal;

import personagens.classes.Valak;
import state.EstadoNormal;

public class RoyalValak extends Valak {
  public RoyalValak() {
    setNome("RoyalValak");
    setVida(250);
    setEscudoOuro(0);
    setEscudoPrata(0);
    setEscudoBronze(0);
    setEstado(new EstadoNormal(this));
  }
}
