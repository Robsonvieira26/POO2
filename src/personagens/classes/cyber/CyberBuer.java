package personagens.classes.cyber;

import strategy.pulo.PBaixo;
import decorator.dano_personagens.DanoBuer;
import personagens.classes.Buer;
import state.EstadoNormal;
import strategy.ataque.AForte;
import strategy.corrida.CRapido;

public class CyberBuer extends Buer {
  // – Personagem 03: iniciado com pulo baixo, corrida rápida, e ataque forte.
  public CyberBuer() {
    setNome("CyberBuer");
    setAtacar(new AForte());
    setCorrer(new CRapido());
    setPular(new PBaixo());
    setVida(70);
    setEscudoOuro(10);
    setEscudoPrata(0);
    setEscudoBronze(0);
    setEstado(new EstadoNormal(this));
    setDanoCausado(new DanoBuer());
    // setDanoCausado();

  }

}
