
// import personagens.classes.Buer;
// import personagens.classes.Succubus;
import personagens.Dano;
import personagens.classes.Valak;

public class App {
    public static void main(String[] args) throws Exception {

        Valak p1 = new Valak();
        // Succubus p2 = new Succubus();
        // Buer p3 = new Buer();

        p1.Atacar();
        p1.Correr();
        p1.Pular();
        System.out.println(p1.getVida());
        System.out.println("\n Teste com escudo Zerado");
        Dano d = new Dano(15.0);
        p1.receberDano(d);
        System.out.println("\n Teste com escudo adicionado");
        p1.setEscudos(new int[] { 10 });
        p1.receberDano(d);
        // //
        // p2.Atacar();
        // p2.Correr();
        // p2.Pular();
        // System.out.println("\n");

        // // //
        // p3.Atacar();
        // p3.Correr();
        // p3.Pular();
    }
}
