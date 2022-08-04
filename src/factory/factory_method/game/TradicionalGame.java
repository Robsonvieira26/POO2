package factory.factory_method.game;

import factory.factory_method.SimplePersonagemFactory;
import factory.factory_method.other_factories.SimplePersonagemCyberFactory;
import factory.factory_method.other_factories.SimplePersonagemRoyalFactory;
import personagens.Personagem;

public class TradicionalGame extends Game {

  @Override
  public Personagem createPersonagem(int estiloJogo) {
    Personagem p = null;
    if (estiloJogo == 0) {
      SimplePersonagemFactory singleton = SimplePersonagemFactory.getInstance();
      p = singleton.createPersonagem();
    } else if (estiloJogo == 1) {
      SimplePersonagemCyberFactory singleton = SimplePersonagemCyberFactory.getInstance();
      p = singleton.createPersonagem();
    } else {
      SimplePersonagemRoyalFactory singleton = SimplePersonagemRoyalFactory.getInstance();
      p = singleton.createPersonagem();
    }

    return p;
  }

}
