package personagens.classes.cyber;

import personagens.classes.Succubus;
import state.EstadoNormal;

public class CyberSuccubus extends Succubus {
  // – Personagem 02: iniciado com pulo alto, corrida rápida, e ataque médio.
  public CyberSuccubus() {
    setNome("CyberSuccubus");
    setVida(140);
    setEscudoOuro(15);
    setEscudoPrata(0);
    setEscudoBronze(0);
    setEstado(new EstadoNormal(this));
  }

}
