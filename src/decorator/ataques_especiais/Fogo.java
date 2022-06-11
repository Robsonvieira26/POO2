package decorator.ataques_especiais;

import decorator.DanoCausadoDecorador;
import personagens.DanoCausado;

public class Fogo extends DanoCausadoDecorador {
  public Fogo(DanoCausado danoCausado) {
    super(danoCausado);
    System.out.println("Fogo Aumentando poder em 50%");
    setDano(1.5);
  }

}
