package strategy.corrida;

import strategy.Correr;

public class CRapido extends Correr {

  @Override
  public void correr(String nome) {
    System.out.println(nome + " correu rapidamente!");
  }

}
