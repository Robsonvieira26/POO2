package strategy.ataque;

import strategy.Atacar;

public class ANormal extends Atacar {
  public void atacar(String nome) {
    System.out.println(nome + " usou um ataque Normal!");
  }

  @Override
  public String toString() {
    return "ANormal";
  }
}
