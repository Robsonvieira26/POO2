package composite;

import personagens.Personagem;

public interface Sala {

  public void defineAcao(Personagem heroi);

  public void addSala(Sala sala1, Sala sala2, Personagem inimigo);
}