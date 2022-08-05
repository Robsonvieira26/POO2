package composite;

import java.util.ArrayList;
import java.util.Random;

import personagens.Personagem;

public class SalaNormal implements Sala {
  private ArrayList<Sala> children = new ArrayList<Sala>();
  private Personagem inimigo;

  public void addSala(Sala sala1, Sala sala2, Personagem inimigo) {
    children.add(sala1);
    children.add(sala2);
    this.inimigo = inimigo;
  }

  public void jogar(Personagem p) {
    p.informaAtributos();
    System.out.println("Sala normal");
    System.out.println("O inimigo é " + inimigo.getNome());
    int dano = lutar();
    System.out.println("O dano recebido foi " + dano);
    p.setVida(p.getVida() - dano);
    int resultado = 2;
    if (p.getVida() > 0) {
      resultado = 1;// sobreviveu
    }

    if (children.size() > 0 && resultado == 1) {
      int caminhoEscolhido = selecionarCaminho();
      children.get(caminhoEscolhido).jogar(p);
    } else if (children.size() > 0 && resultado == 2) {
      System.out.println(p.getNome() + " Morreu");
    } else if (children.size() == 0) {
      System.out.println("Problema na criação do labirinto");
    }
  }

  @Override
  public int selecionarCaminho() {
    // automatico
    double random = Math.random();
    if (random <= 0.5) {
      System.out.println("Foi pelo caminho 1");
      return 0;
    } else {
      System.out.println("Foi pelo caminho 2");
      return 1;
    }
  }

  @Override
  public int lutar() {
    Random rn = new Random();
    int dano = rn.nextInt(10) + 1;
    return dano;
  }
}
