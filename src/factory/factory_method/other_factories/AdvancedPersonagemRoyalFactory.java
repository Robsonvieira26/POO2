package factory.factory_method.other_factories;

import decorator.dano_personagens.DanoAbadon;
import decorator.dano_personagens.DanoBuer;
import decorator.dano_personagens.DanoMorningstarBuff;
import decorator.dano_personagens.DanoSuccubus;
import decorator.dano_personagens.DanoValak;
import personagens.Personagem;
import personagens.classes.royal.RoyalAbadon;
import personagens.classes.royal.RoyalBuer;
import personagens.classes.royal.RoyalMorningstar;
import personagens.classes.royal.RoyalSuccubus;
import personagens.classes.royal.RoyalValak;
import strategy.ataque.ANormal;
import strategy.corrida.CMedio;
import strategy.pulo.PMedio;

public class AdvancedPersonagemRoyalFactory {
  private static AdvancedPersonagemRoyalFactory instance = null;

  private AdvancedPersonagemRoyalFactory() {
    super();
  }

  public static AdvancedPersonagemRoyalFactory getInstance() {
    if (instance == null) {
      instance = new AdvancedPersonagemRoyalFactory();
    }
    return instance;
  }

  public Personagem createPersonagem() {
    Personagem personagem = null;
    double random = Math.random();
    // System.out.println(random);
    if (random <= 0.2) {
      personagem = new RoyalValak();
      personagem.setDanoCausado(new DanoValak());
      personagem.setAtacar(new ANormal()); // nerfado
    } else if (random <= 0.4) {
      personagem = new RoyalSuccubus();
      personagem.setDanoCausado(new DanoSuccubus());
      personagem.setCorrer(new CMedio()); // nerfado
    } else if (random <= 0.6) {
      personagem = new RoyalBuer();
      personagem.setDanoCausado(new DanoBuer());
      personagem.setAtacar(new ANormal()); // nerfado
    } else if (random <= 0.8) {
      personagem = new RoyalAbadon();
      personagem.setDanoCausado(new DanoAbadon());
      personagem.setAtacar(new ANormal()); // nerfado
    } else if (random <= 1.0) {
      personagem = new RoyalMorningstar();
      personagem.setDanoCausado(new DanoMorningstarBuff());
      personagem.setAtacar(new ANormal()); // BUFFADO
      personagem.setCorrer(new CMedio()); // BUFFADO
      personagem.setPular(new PMedio()); // BUFFADO
    }
    return personagem;
  }
}
