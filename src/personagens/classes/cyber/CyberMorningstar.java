package personagens.classes.cyber;

import decorator.dano_personagens.DanoMorningstar;
import personagens.classes.Morningstar;
import state.EstadoNormal;

public class CyberMorningstar extends Morningstar {
  public CyberMorningstar() {
    setNome("CyberMorningstar");
    setVida(30);
    setEscudoOuro(30);
    setEscudoPrata(0);
    setEscudoBronze(0);
    setEstado(new EstadoNormal(this));
    setDanoCausado(new DanoMorningstar());
    // setDanoCausado();

  }
}