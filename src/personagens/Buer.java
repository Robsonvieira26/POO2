package personagens;

import strategy.ataque.AForte;
import strategy.corrida.CRapido;
import strategy.pulo.PBaixo;

public class Buer extends Personagem {
  // – Personagem 03: iniciado com pulo baixo, corrida rápida, e ataque forte.
  public Buer() {
    setNome("Buer");
    setAtacar(new AForte());
    setCorrer(new CRapido());
    setPular(new PBaixo());

  }

}
