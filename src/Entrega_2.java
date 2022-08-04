import factory.factory_method.AdvancedePersonagemFactory;
import factory.factory_method.SimplePersonagemFactory;
import factory.factory_method.game.AdvancedGame;
import factory.factory_method.game.Game;
import factory.factory_method.game.TradicionalGame;
import personagens.Personagem;

public class Entrega_2 {
  public static void main(String[] args) {
    System.out.println("Personagens criados pelo SimplePersonagemFactory");
    SimplePersonagemFactory singleton = SimplePersonagemFactory.getInstance();
    for (int i = 0; i < 10; i++) {
      Personagem personagem = singleton.createPersonagem();
      System.out.println(personagem.getNome());
      System.out.println("Dano:" + personagem.informaDanoCausado() + "\n");

    }
    System.out.println("Personagens criados pelo AdvancedePersonagemFactory");
    AdvancedePersonagemFactory singletonAdvanced = AdvancedePersonagemFactory.getInstance();
    for (int i = 0; i < 10; i++) {
      Personagem personagem = singletonAdvanced.createPersonagem();
      System.out.println(personagem.getNome());
      System.out.println("Dano:" + personagem.informaDanoCausado() + "\n");

    }
    System.out.println("\n------------\nJogo simples:");
    Game gameSimples = new TradicionalGame();
    gameSimples.Jogar();

    System.out.println("\n------------\nJogo Avancado:");
    Game gameAvancado = new AdvancedGame();
    gameAvancado.Jogar();

  }

}
