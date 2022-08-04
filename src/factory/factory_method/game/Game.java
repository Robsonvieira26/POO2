package factory.factory_method.game;

import personagens.Personagem;

public abstract class Game {
  public abstract Personagem createPersonagem(int estiloJogo);

  public void Jogar(int estiloJogo) {
    Personagem p1 = createPersonagem(estiloJogo);
    Personagem p2 = createPersonagem(estiloJogo);
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
    int cont = 0;
    int silence = 0;
    while (p1.getVida() > 0 && p2.getVida() > 0) {
      double dano1 = p1.informaDanoCausado();
      p2.receberDano(dano1, silence);
      if (p2.getVida() > 0) {
        double dano2 = p2.informaDanoCausado();
        p1.receberDano(dano2, silence);
      }
      cont++;
      if (cont == 10) {
        System.out.println("Ativando batalha silenciosa para melhorar a performance");
        silence = 1;
      }
    }
    if (p1.getVida() > 0) {
      System.out.println("Vencedor: " + p1.getNome());
    } else {
      System.out.println("Vencedor: " + p2.getNome());
    }
  }
}
