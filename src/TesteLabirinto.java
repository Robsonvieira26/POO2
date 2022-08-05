
import composite.Sala;
import composite.SalaAbismo;
import composite.SalaNormal;
import composite.SalaSaida;
import factory.factory_method.SimplePersonagemFactory;
import personagens.Personagem;

public class TesteLabirinto {
  public static void main(String[] args) {

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

    sala1.defineAcao(heroi);

  }
}
