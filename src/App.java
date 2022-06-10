import personagens.Buer;
import personagens.Succubus;
import personagens.Valak;

public class App {
    public static void main(String[] args) throws Exception {

        Valak p1 = new Valak();
        Succubus p2 = new Succubus();
        Buer p3 = new Buer();

        p1.Atacar();
        p1.Correr();
        p1.Pular();
        System.out.println("\n");
        // //
        p2.Atacar();
        p2.Correr();
        p2.Pular();
        System.out.println("\n");

        // //
        p3.Atacar();
        p3.Correr();
        p3.Pular();
    }
}
