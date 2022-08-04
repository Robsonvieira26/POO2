package personagens.classes.royal;

import personagens.classes.Succubus;
import state.EstadoNormal;

public class RoyalSuccubus extends Succubus {
  public RoyalSuccubus() {
    setNome("RoyalSuccubus");
    setVida(160);
    setEscudoOuro(0);
    setEscudoPrata(0);
    setEscudoBronze(0);
    setEstado(new EstadoNormal(this));
  }

}
