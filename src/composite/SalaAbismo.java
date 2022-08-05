package composite;

import personagens.Personagem;

public class SalaAbismo implements Sala {
  public void defineAcao(Personagem heroi) {
    heroi.informaAtributos();
    System.out.println("Sala de abismo");
    heroi.setVida(0);
    System.out.println(heroi.getNome() + " perdeu o jogo!");
  }

  @Override
  public void addSala(Sala sala1, Sala sala2, Personagem inimigo) {
    System.out.println("Não é possível adicionar salas a sala de abismo");
  }
}
