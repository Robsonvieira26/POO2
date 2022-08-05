package composite;

import personagens.Personagem;

public class SalaSaida implements Sala {
  public void jogar(Personagem p) {
    p.informaAtributos();
    System.out.println("Sala de saida\nVoce venceu o Labirinto!");
  }

  @Override
  public void addSala(Sala sala1, Sala sala2, Personagem inimigo) {
    System.out.println("Não é possível adicionar salas a sala de saida");
  }

  @Override
  public int selecionarCaminho() {
    System.out.println("Não é possível selecionar caminho a sala de saida");
    return 0;
  }

  @Override
  public int lutar() {
    System.out.println("Não é possível lutar a sala de saida");
    return 0;
  }

}
