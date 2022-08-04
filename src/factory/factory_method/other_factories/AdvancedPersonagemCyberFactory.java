package factory.factory_method.other_factories;

import decorator.dano_personagens.DanoAbadon;
import decorator.dano_personagens.DanoBuer;
import decorator.dano_personagens.DanoMorningstarBuff;
import decorator.dano_personagens.DanoSuccubus;
import decorator.dano_personagens.DanoValak;
import personagens.Personagem;
import personagens.classes.cyber.CyberAbadon;
import personagens.classes.cyber.CyberBuer;
import personagens.classes.cyber.CyberMorningstar;
import personagens.classes.cyber.CyberSuccubus;
import personagens.classes.cyber.CyberValak;
import strategy.ataque.ANormal;
import strategy.corrida.CMedio;
import strategy.pulo.PMedio;

public class AdvancedPersonagemCyberFactory {
  private static AdvancedPersonagemCyberFactory instance = null;

  private AdvancedPersonagemCyberFactory() {
    super();
  }

  public static AdvancedPersonagemCyberFactory getInstance() {
    if (instance == null) {
      instance = new AdvancedPersonagemCyberFactory();
    }
    return instance;
  }

  public Personagem createPersonagem() {
    Personagem personagem = null;
    double random = Math.random();
    // System.out.println(random);
    if (random <= 0.2) {
      personagem = new CyberValak();
      personagem.setDanoCausado(new DanoValak());
      personagem.setAtacar(new ANormal()); // nerfado
    } else if (random <= 0.4) {
      personagem = new CyberSuccubus();
      personagem.setDanoCausado(new DanoSuccubus());
      personagem.setCorrer(new CMedio()); // nerfado
    } else if (random <= 0.6) {
      personagem = new CyberBuer();
      personagem.setDanoCausado(new DanoBuer());
      personagem.setAtacar(new ANormal()); // nerfado
    } else if (random <= 0.8) {
      personagem = new CyberAbadon();
      personagem.setDanoCausado(new DanoAbadon());
      personagem.setAtacar(new ANormal()); // nerfado
    } else if (random <= 1.0) {
      personagem = new CyberMorningstar();
      personagem.setDanoCausado(new DanoMorningstarBuff());
      personagem.setAtacar(new ANormal()); // BUFFADO
      personagem.setCorrer(new CMedio()); // BUFFADO
      personagem.setPular(new PMedio()); // BUFFADO
    }
    return personagem;
  }
}
