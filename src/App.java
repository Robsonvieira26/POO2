
// import personagens.classes.Buer;
// import personagens.classes.Succubus;
import decorator.ataques_especiais.Fogo;
import personagens.classes.Valak;

public class App {
    public static void main(String[] args) throws Exception {

        Valak p1 = new Valak();
        // Succubus p2 = new Succubus();
        // Buer p3 = new Buer();
        // normal
        // p1.setEscudoBronze(50);
        // p1.getEscudos();
        // p1.receberDano(60);
        // System.out.println("Vida: " + p1.getVida());
        // perigo
        p1.curarVida(100);
        System.out.println("Vida: " + p1.getVida());
        p1.getDanoCausado();

        p1.setDanoCausado(new Fogo(p1.getDanoCausado()));
        p1.getDanoCausado();
        // forte
        // p1.receberDano(500);
        // System.out.println("Vida: " + p1.getVida());

        // morto
        // p1.Atacar();
        // p1.Correr();
        // p1.Pular();
        // System.out.println(p1.getVida());
        // System.out.println("\n Teste com escudo Zerado");
        // Dano d = new Dano(15.0);
        // p1.receberDano(d);
        // System.out.println("\n Teste com escudo adicionado");
        // p1.setEscudoOuro(16);
        // p1.receberDano(d);

    }
}
