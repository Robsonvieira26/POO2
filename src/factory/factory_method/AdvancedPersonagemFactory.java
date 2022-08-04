package factory.factory_method;

import decorator.dano_personagens.DanoAbadon;
import decorator.dano_personagens.DanoBuer;
import decorator.dano_personagens.DanoMorningstarBuff;
import decorator.dano_personagens.DanoSuccubus;
import decorator.dano_personagens.DanoValak;
import personagens.Personagem;
import personagens.classes.Abadon;
import personagens.classes.Buer;
import personagens.classes.Morningstar;
import personagens.classes.Succubus;
import personagens.classes.Valak;
import strategy.ataque.ANormal;
import strategy.corrida.CMedio;
import strategy.pulo.PMedio;

public class AdvancedPersonagemFactory {
  private static AdvancedPersonagemFactory instance = null;

  private AdvancedPersonagemFactory() {
    super();
  }

  public static AdvancedPersonagemFactory getInstance() {
    if (instance == null) {
      instance = new AdvancedPersonagemFactory();
    }
    return instance;
  }

  public Personagem createPersonagem() {
    Personagem personagem = null;
    double random = Math.random();
    // System.out.println(random);
    if (random <= 0.2) {
      personagem = new Valak();
      personagem.setDanoCausado(new DanoValak());
      personagem.setAtacar(new ANormal()); // nerfado
    } else if (random <= 0.4) {
      personagem = new Succubus();
      personagem.setDanoCausado(new DanoSuccubus());
      personagem.setCorrer(new CMedio()); // nerfado
    } else if (random <= 0.6) {
      personagem = new Buer();
      personagem.setDanoCausado(new DanoBuer());
      personagem.setAtacar(new ANormal()); // nerfado
    } else if (random <= 0.8) {
      personagem = new Abadon();
      personagem.setDanoCausado(new DanoAbadon());
      personagem.setAtacar(new ANormal()); // nerfado
    } else if (random <= 1.0) {
      personagem = new Morningstar();
      personagem.setDanoCausado(new DanoMorningstarBuff());
      personagem.setAtacar(new ANormal()); // BUFFADO
      personagem.setCorrer(new CMedio()); // BUFFADO
      personagem.setPular(new PMedio()); // BUFFADO
    }
    return personagem;
  }
}
