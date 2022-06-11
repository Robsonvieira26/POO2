package chain;

import personagens.DanoRecebido;

public abstract class Escudo {
  protected Escudo proximo;
  protected int protecao;

  public int getProtecao() {
    return protecao;
  }

  public void setProtecao(int protecao) {
    this.protecao = protecao;
  }

  public Escudo(Escudo proximo) {
    this.proximo = proximo;
  }

  public abstract double processaDano(DanoRecebido d);
}
