package composite.template_method;

import java.io.Console;
import java.util.Random;

import composite.SalaNormal;

public class SalaNormalUserFight extends SalaNormal {

  @Override
  public int lutar() {
    Random rn = new Random();
    int dano = rn.nextInt(10) + 1;
    // Manual
    System.out.println("Advinhe o valor do dano entre 1 e 10 ");
    Console console = System.console();
    int danoChute = Integer.parseInt(console.readLine());
    System.out.println("O chute foi " + danoChute + " e o Valor era " + dano);
    if (danoChute == dano)
      dano = 0;
    else
      dano = danoChute;

    return dano;
  }
}
