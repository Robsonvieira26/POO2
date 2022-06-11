package personagens.classes;


import personagens.Personagem;
import state.EstadoNormal;
import strategy.ataque.ANormal;
import strategy.corrida.CRapido;
import strategy.pulo.PAlto;

public class Succubus extends Personagem {
  // – Personagem 02: iniciado com pulo alto, corrida rápida, e ataque médio.
  public Succubus() {
    setNome("Succubus");
    setAtacar(new ANormal());
    setCorrer(new CRapido());
    setPular(new PAlto());
    setVida(70);
    setEscudoOuro(0);
    setEscudoPrata(0);
    setEscudoBronze(0);
    setEstado(new EstadoNormal(this));


  }

}
