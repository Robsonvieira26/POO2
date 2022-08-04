package factory.factory_method.game;

import decorator.ataques_especiais.EstrelaCaida;
import decorator.ataques_especiais.Fogo;
import decorator.ataques_especiais.Veneno;
import factory.factory_method.AdvancedePersonagemFactory;
import personagens.Personagem;

public class AdvancedGame extends Game {
  @Override
  public Personagem createPersonagem() {
    AdvancedePersonagemFactory singleton = AdvancedePersonagemFactory.getInstance();
    Personagem p = singleton.createPersonagem();
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

  public static AdvancedGame getInstance() {
    return null;
  }
}
