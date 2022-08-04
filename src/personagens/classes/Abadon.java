package personagens.classes;

import strategy.pulo.PAlto;
import decorator.dano_personagens.DanoAbadon;
import personagens.Personagem;
import state.EstadoNormal;
import strategy.ataque.AForte;
import strategy.corrida.CDevagar;

public class Abadon extends Personagem {
  // – Personagem 03: iniciado com pulo baixo, corrida rápida, e ataque forte.
  public Abadon() {
    setNome("Abadon");
    setAtacar(new AForte());
    setCorrer(new CDevagar());
    setPular(new PAlto());
    setVida(70);
    setEscudoOuro(0);
    setEscudoPrata(0);
    setEscudoBronze(0);
    setEstado(new EstadoNormal(this));
    setDanoCausado(new DanoAbadon());
    // setDanoCausado();

  }

}
