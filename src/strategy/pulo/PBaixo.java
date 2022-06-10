package strategy.pulo;

import strategy.Pular;

public class PBaixo extends Pular {

  @Override
  public void pular(String nome) {
    System.out.println(nome + " usou um pulo baixo");
  }

}
