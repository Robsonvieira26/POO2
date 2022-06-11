package chain;

import personagens.DanoRecebido;

public class EscudoPrata extends Escudo {
  public EscudoPrata(Escudo proximo,int protecao) {
    super(proximo);
    setProtecao(protecao);
  }
    

  @Override
  public double processaDano(DanoRecebido d) {
    d.setAtaqueInimigo(d.getAtaqueInimigo() - getProtecao());
    if (d.getAtaqueInimigo() < 0) {
      d.setAtaqueInimigo(0);

      return d.getAtaqueInimigo();
    }
    return proximo.processaDano(d);

  }
}
