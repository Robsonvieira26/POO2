
import composite.Sala;
import composite.SalaAbismo;
import composite.SalaNormal;
import composite.SalaSaida;
import composite.template_method.SalaNormalUser;
import composite.template_method.SalaNormalUserFight;
import composite.template_method.SalaNormalUserPath;
import factory.factory_method.SimplePersonagemFactory;
import personagens.Personagem;

public class TesteLabirinto {
  public static void main(String[] args) {
    TesteLabirintoTemplateMethod();
  }

  public static void TesteLabirinto1() {
    SimplePersonagemFactory singleton = SimplePersonagemFactory.getInstance();
    Personagem heroi = singleton.createPersonagem();
    Personagem inimigo = singleton.createPersonagem();
    Personagem inimigo2 = singleton.createPersonagem();
    // Labirinto
    Sala sala1 = new SalaNormal();
    Sala sala2 = new SalaNormal();
    Sala sala3 = new SalaNormal();
    sala1.addSala(sala2, new SalaAbismo(), inimigo);
    sala2.addSala(sala3, new SalaSaida(), inimigo2);

    sala1.jogar(heroi);
  }

  public static void TesteLabirintoTemplateMethod() {
    SimplePersonagemFactory singleton = SimplePersonagemFactory.getInstance();
    Personagem heroi = singleton.createPersonagem();
    Personagem inimigo = singleton.createPersonagem();
    Personagem inimigo2 = singleton.createPersonagem();
    // Labirinto
    Sala sala1 = new SalaNormalUser();
    Sala sala2 = new SalaNormalUserFight();
    Sala sala3 = new SalaNormalUserPath();
    sala1.addSala(sala2, new SalaAbismo(), inimigo);
    sala2.addSala(sala3, new SalaSaida(), inimigo2);
    sala3.addSala(new SalaAbismo(), new SalaSaida(), inimigo);
    sala1.jogar(heroi);
  }
}
