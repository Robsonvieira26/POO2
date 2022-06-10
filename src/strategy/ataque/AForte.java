package strategy.ataque;

import strategy.Atacar;

public class AForte extends Atacar {
  public void atacar(String nome) {
    System.out.println(nome + " usou um ataque forte!");
  }

}
