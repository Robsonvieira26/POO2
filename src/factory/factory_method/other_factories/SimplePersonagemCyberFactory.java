package factory.factory_method.other_factories;

import decorator.dano_personagens.DanoAbadon;
import decorator.dano_personagens.DanoBuer;
import decorator.dano_personagens.DanoMorningstar;
import decorator.dano_personagens.DanoSuccubus;
import decorator.dano_personagens.DanoValak;
import personagens.Personagem;
import personagens.classes.cyber.CyberAbadon;
import personagens.classes.cyber.CyberBuer;
import personagens.classes.cyber.CyberMorningstar;
import personagens.classes.cyber.CyberSuccubus;
import personagens.classes.cyber.CyberValak;

public class SimplePersonagemCyberFactory {
  private static SimplePersonagemCyberFactory instance = null;

  private SimplePersonagemCyberFactory() {
    super();
  }

  public static SimplePersonagemCyberFactory getInstance() {
    if (instance == null) {
      instance = new SimplePersonagemCyberFactory();
    }
    return instance;
  }

  public Personagem createPersonagem() {
    Personagem p = null;
    double random = Math.random();
    // System.out.println(random);
    if (random <= 0.2) {
      p = new CyberValak();
      p.setDanoCausado(new DanoValak());
    } else if (random <= 0.4) {
      p = new CyberSuccubus();
      p.setDanoCausado(new DanoSuccubus());
    } else if (random <= 0.6) {
      p = new CyberBuer();
      p.setDanoCausado(new DanoBuer());
    } else if (random <= 0.8) {
      p = new CyberAbadon();
      p.setDanoCausado(new DanoAbadon());
    } else {
      p = new CyberMorningstar();
      p.setDanoCausado(new DanoMorningstar());
    }
    return p;
  }
}