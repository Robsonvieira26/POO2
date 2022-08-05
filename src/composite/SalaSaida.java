package composite;

import personagens.Personagem;

public class SalaSaida implements Sala {
  public void defineAcao(Personagem heroi) {
    heroi.informaAtributos();
    System.out.println("Sala de saida\nVoce venceu o Labirinto!");
  }

  @Override
  public void addSala(Sala sala1, Sala sala2, Personagem inimigo) {
    System.out.println("Não é possível adicionar salas a sala de saida");
  }

}
