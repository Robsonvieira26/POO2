package composite;

import java.util.ArrayList;

import personagens.Personagem;

public class SalaNormal implements Sala {
  private ArrayList<Sala> children = new ArrayList<Sala>();
  private Personagem inimigo;

  public void addSala(Sala sala1, Sala sala2, Personagem inimigo) {
    children.add(sala1);
    children.add(sala2);
    this.inimigo = inimigo;
  }

  public void defineAcao(Personagem heroi) {
    heroi.informaAtributos();
    System.out.println("Sala normal");

    int resultado = geraCombate(heroi, this.inimigo);

    double random = Math.random();
    if (children.size() > 0 && resultado == 1) {
      if (random <= 0.5) {
        System.out.println("Foi pelo caminho 1");
        children.get(0).defineAcao(heroi);
      } else {
        System.out.println("Foi pelo caminho 2");
        children.get(1).defineAcao(heroi);
      }
    } else if (children.size() > 0 && resultado == 2) {
      System.out.println(heroi.getNome() + " Morreu");
    } else if (children.size() == 0) {
      System.out.println("Problema na criação do labirinto");
    }
  }

  public int geraCombate(Personagem p1, Personagem p2) {

    int prioridade1 = p1.definePrioridade();
    int prioridade2 = p2.definePrioridade();

    if (prioridade1 > prioridade2) {
      System.out.println("Prioridade de ataque " + p1.getNome() + " depois, " + p2.getNome());
      return Combate(p1, p2);
    } else if (prioridade1 < prioridade2) {
      System.out.println("Prioridade de ataque " + p2.getNome() + " depois, " + p1.getNome());
      return Combate(p2, p1);
    } else {
      System.out.println("Prioridade de ataque " + p1.getNome() + " depois, " + p2.getNome());
      return Combate(p1, p2);
    }
  }

  public int Combate(Personagem p1, Personagem p2) {
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
      return 1;
    } else {
      System.out.println("Vencedor: " + p2.getNome());
      return 2;
    }
  }
}
