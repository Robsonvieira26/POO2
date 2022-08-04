package factory.factory_method;

import decorator.dano_personagens.DanoAbadon;
import decorator.dano_personagens.DanoBuer;
import decorator.dano_personagens.DanoMorningstar;
import decorator.dano_personagens.DanoSuccubus;
import decorator.dano_personagens.DanoValak;
import personagens.Personagem;
import personagens.classes.Abadon;
import personagens.classes.Buer;
import personagens.classes.Morningstar;
import personagens.classes.Succubus;
import personagens.classes.Valak;

public class SimplePersonagemFactory {
  public static Personagem createPersonagem() {
    Personagem p = null;
    double random = Math.random();
    // System.out.println(random);
    if (random <= 0.2) {
      p = new Valak();
      p.setDanoCausado(new DanoValak());
    } else if (random <= 0.4) {
      p = new Succubus();
      p.setDanoCausado(new DanoSuccubus());
    } else if (random <= 0.6) {
      p = new Buer();
      p.setDanoCausado(new DanoBuer());
    } else if (random <= 0.8) {
      p = new Abadon();
      p.setDanoCausado(new DanoAbadon());
    } else {
      p = new Morningstar();
      p.setDanoCausado(new DanoMorningstar());
    }
    return p;
  }
}