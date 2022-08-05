package composite.template_method;

import java.io.Console;

import composite.SalaNormal;

public class SalaNormalUserPath extends SalaNormal {
  @Override
  public int selecionarCaminho() {
    // Manual
    System.out.println("Selecion o caminho que deseja seguir: [1] ou [2] ");
    Console console = System.console();
    int caminho = Integer.parseInt(console.readLine());
    System.out.println("O caminho escolhido foi: " + caminho);
    return caminho - 1;
  }
}
