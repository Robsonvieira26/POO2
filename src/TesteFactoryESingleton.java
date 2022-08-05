import factory.factory_method.AdvancedPersonagemFactory;
import factory.factory_method.SimplePersonagemFactory;
import factory.factory_method.game.AdvancedGame;
import factory.factory_method.game.Game;
import factory.factory_method.game.TradicionalGame;
import personagens.Personagem;

public class TesteFactoryESingleton {
  public static void main(String[] args) {
    System.out.println("Personagens criados pelo SimplePersonagemFactory");
    SimplePersonagemFactory singleton = SimplePersonagemFactory.getInstance();
    for (int i = 0; i < 10; i++) {
      Personagem personagem = singleton.createPersonagem();
      System.out.println(personagem.getNome());
      System.out.println("Dano:" + personagem.informaDanoCausado() + "\n");
    }

    System.out.println("Personagens criados pelo AdvancedePersonagemFactory");
    AdvancedPersonagemFactory singletonAdvanced = AdvancedPersonagemFactory.getInstance();
    for (int i = 0; i < 10; i++) {
      Personagem personagem = singletonAdvanced.createPersonagem();
      System.out.println(personagem.getNome());
      System.out.println("Dano:" + personagem.informaDanoCausado() + "\n");
      }
      
      System.out.println("\n------------\nJogo simples:");
      Game gameSimples = new TradicionalGame();
      gameSimples.Jogar(1);

      System.out.println("\n------------\nJogo Avancado:");
      Game gameAvancado = new AdvancedGame();
      gameAvancado.Jogar(2);

    }

  }

