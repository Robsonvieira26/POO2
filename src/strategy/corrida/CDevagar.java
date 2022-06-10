package strategy.corrida;

import strategy.Correr;

public class CDevagar extends Correr {
  @Override
  public void correr(String nome) {
    System.out.println(nome + " correu devagar!");
  }
}
