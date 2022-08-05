package composite;

import personagens.Personagem;

public class SalaAbismo implements Sala {
  public void jogar(Personagem p) {
    p.informaAtributos();
    System.out.println("Sala de abismo");
    p.setVida(0);
    System.out.println(p.getNome() + " perdeu o jogo!");
  }

  @Override
  public void addSala(Sala sala1, Sala sala2, Personagem inimigo) {
    System.out.println("Não é possível adicionar salas a sala de abismo");
  }
}
