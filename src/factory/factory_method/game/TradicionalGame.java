package factory.factory_method.game;

import factory.factory_method.SimplePersonagemFactory;
import personagens.Personagem;

public class TradicionalGame extends Game {

  @Override
  public Personagem createPersonagem() {
    return SimplePersonagemFactory.createPersonagem();
  }

}
