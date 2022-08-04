package personagens.classes;

import decorator.dano_personagens.DanoMorningstar;
import personagens.Personagem;
import state.EstadoNormal;
import strategy.ataque.AFraco;
import strategy.corrida.CDevagar;
import strategy.pulo.PBaixo;

public class Morningstar extends Personagem {
  public Morningstar() {
    setNome("Morningstar");
    setAtacar(new AFraco());
    setCorrer(new CDevagar());
    setPular(new PBaixo());
    setVida(45);
    setEscudoOuro(0);
    setEscudoPrata(0);
    setEscudoBronze(0);
    setEstado(new EstadoNormal(this));
    setDanoCausado(new DanoMorningstar());
    // setDanoCausado();

  }
}
