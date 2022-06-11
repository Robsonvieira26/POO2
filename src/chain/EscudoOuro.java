package chain;

import personagens.DanoRecebido;

public class EscudoOuro extends Escudo {
  public EscudoOuro(Escudo proximo,int protecao) {
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
