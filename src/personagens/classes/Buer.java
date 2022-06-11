package personagens.classes;

import strategy.pulo.PBaixo;
import personagens.Personagem;
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

  }

}
