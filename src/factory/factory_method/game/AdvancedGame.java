package factory.factory_method.game;

import decorator.ataques_especiais.EstrelaCaida;
import decorator.ataques_especiais.Fogo;
import decorator.ataques_especiais.Veneno;
import factory.abstract_factory.AdvancedPersonagemCyberFactory;
import factory.abstract_factory.AdvancedPersonagemRoyalFactory;
import factory.factory_method.AdvancedPersonagemFactory;
import personagens.Personagem;

public class AdvancedGame extends Game {
  @Override
  public Personagem createPersonagem(int estiloJogo) {
    Personagem p = null;
    if (estiloJogo == 0) {
      AdvancedPersonagemFactory singleton = AdvancedPersonagemFactory.getInstance();
      p = singleton.createPersonagem();
    } else if (estiloJogo == 1) {
      AdvancedPersonagemCyberFactory singleton = AdvancedPersonagemCyberFactory.getInstance();
      p = singleton.createPersonagem();
    } else {
      AdvancedPersonagemRoyalFactory singleton = AdvancedPersonagemRoyalFactory.getInstance();
      p = singleton.createPersonagem();
    }

    double random = Math.random();
    if (random < 0.49) {
      p.setDanoCausado(new Fogo(p.getDanoCausado()));
    } else if (random < 0.98) {
      p.setDanoCausado(new Veneno(p.getDanoCausado()));
    } else {
      p.setDanoCausado(new EstrelaCaida(p.getDanoCausado()));
    }
    return p;
  }

}
