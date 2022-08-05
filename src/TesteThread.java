import thread.MultGames;

public class TesteThread {
  public static void main(String[] args) {
    new MultGames().start();
    new MultGames().start();

  }
}
