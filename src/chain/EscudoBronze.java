package chain;

import personagens.Dano;

public class EscudoBronze extends Escudo{
 public EscudoBronze(Escudo proximo,int protecao) {
  super(proximo);
  setProtecao(protecao);
}
  

@Override
public double processaDano(Dano d) {
  d.setAtaqueInimigo(d.getAtaqueInimigo() - getProtecao());
  if (d.getAtaqueInimigo() < 0) {
    d.setAtaqueInimigo(0);

    return d.getAtaqueInimigo();
  }
  return proximo.processaDano(d);

}
}
