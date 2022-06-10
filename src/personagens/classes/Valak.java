package personagens.classes;

import personagens.Personagem;
import state.EstadoNormal;
import strategy.ataque.AForte;
import strategy.corrida.CMedio;
import strategy.pulo.PMedio;

public class Valak extends Personagem {
  // – personagem 01: iniciado com pulo médio, corrida média e ataque forte.
  public Valak() {
    setNome("Valak");
    setAtacar(new AForte());
    setCorrer(new CMedio());
    setPular(new PMedio());
    setVida(70);
    setEstado(new EstadoNormal(this));
    
  }

}
