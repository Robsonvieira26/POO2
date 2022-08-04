package factory.factory_method.other_factories;

import decorator.dano_personagens.DanoAbadon;
import decorator.dano_personagens.DanoBuer;
import decorator.dano_personagens.DanoMorningstar;
import decorator.dano_personagens.DanoSuccubus;
import decorator.dano_personagens.DanoValak;
import personagens.Personagem;
import personagens.classes.royal.RoyalAbadon;
import personagens.classes.royal.RoyalBuer;
import personagens.classes.royal.RoyalMorningstar;
import personagens.classes.royal.RoyalSuccubus;
import personagens.classes.royal.RoyalValak;

public class SimplePersonagemRoyalFactory {
  private static SimplePersonagemRoyalFactory instance = null;

  private SimplePersonagemRoyalFactory() {
    super();
  }

  public static SimplePersonagemRoyalFactory getInstance() {
    if (instance == null) {
      instance = new SimplePersonagemRoyalFactory();
    }
    return instance;
  }

  public Personagem createPersonagem() {
    Personagem p = null;
    double random = Math.random();
    // System.out.println(random);
    if (random <= 0.2) {
      p = new RoyalValak();
      p.setDanoCausado(new DanoValak());
    } else if (random <= 0.4) {
      p = new RoyalSuccubus();
      p.setDanoCausado(new DanoSuccubus());
    } else if (random <= 0.6) {
      p = new RoyalBuer();
      p.setDanoCausado(new DanoBuer());
    } else if (random <= 0.8) {
      p = new RoyalAbadon();
      p.setDanoCausado(new DanoAbadon());
    } else {
      p = new RoyalMorningstar();
      p.setDanoCausado(new DanoMorningstar());
    }
    return p;
  }
}