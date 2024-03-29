package personagens.classes;

import strategy.pulo.PBaixo;
import decorator.dano_personagens.DanoBuer;
import personagens.Personagem;
import state.EstadoNormal;
import strategy.ataque.AForte;
import strategy.corrida.CRapido;

public class Buer extends Personagem {
  // – Personagem 03: iniciado com pulo baixo, corrida rápida, e ataque forte.
  public Buer() {
    setNome("Buer");
    setAtacar(new AForte());
    setCorrer(new CRapido());
    setPular(new PBaixo());
    setVida(70);
    setEscudoOuro(0);
    setEscudoPrata(0);
    setEscudoBronze(0);
    setEstado(new EstadoNormal(this));
    setDanoCausado(new DanoBuer());
    // setDanoCausado();

  }

}
