package personagens.classes.cyber;


import decorator.dano_personagens.DanoAbadon;
import personagens.classes.Abadon;
import state.EstadoNormal;


public class CyberAbadon extends Abadon {
  // – Personagem 03: iniciado com pulo baixo, corrida rápida, e ataque forte.
  public CyberAbadon() {
    setNome("CyberAbadon");
    setVida(80);
    setEscudoOuro(100);
    setEscudoPrata(0);
    setEscudoBronze(0);
    setEstado(new EstadoNormal(this));
    setDanoCausado(new DanoAbadon());
    // setDanoCausado();

  }

}
