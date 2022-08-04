package factory.factory_method.game;

import personagens.Personagem;

public abstract class Game {
  public abstract Personagem createPersonagem();

  public void Jogar() {
    Personagem p1 = createPersonagem();
    Personagem p2 = createPersonagem();
    System.out.println("P1:" + p1.getNome() + "- Ataque:" + p1.getAtaque());
    System.out.println("P2:" + p2.getNome() + "- Ataque:" + p2.getAtaque());

    int prioridade1 = p1.definePrioridade();
    int prioridade2 = p2.definePrioridade();

    if (prioridade1 > prioridade2) {
      System.out.println("Prioridade de ataque " + p1.getNome() + " depois, " + p2.getNome());
      Combate(p1, p2);
    } else if (prioridade1 < prioridade2) {
      System.out.println("Prioridade de ataque " + p2.getNome() + " depois, " + p1.getNome());
      Combate(p2, p1);
    } else {
      System.out.println("Prioridade de ataque " + p1.getNome() + " depois, " + p2.getNome());
      Combate(p1, p2);
    }

  }

  public void Combate(Personagem p1, Personagem p2) {
    while (p1.getVida() > 0 && p2.getVida() > 0) {
      double dano1 = p1.informaDanoCausado();
      p2.receberDano(dano1);
      if (p2.getVida() > 0) {
        double dano2 = p2.informaDanoCausado();
        p1.receberDano(dano2);
      }
    }
    if (p1.getVida() > 0) {
      System.out.println("Vencedor: " + p1.getNome());
    } else {
      System.out.println("Vencedor: " + p2.getNome());
    }
  }
}
