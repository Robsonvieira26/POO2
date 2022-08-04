package personagens.classes.cyber;

import decorator.dano_personagens.DanoValak;
import personagens.classes.Valak;
import state.EstadoNormal;

public class CyberValak extends Valak {
  public CyberValak() {
    setNome("CyberValak");
    setVida(160);
    setEscudoOuro(10);
    setEscudoPrata(0);
    setEscudoBronze(0);
    setEstado(new EstadoNormal(this));
    setDanoCausado(new DanoValak());
  }

}
