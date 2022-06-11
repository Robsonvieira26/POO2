package decorator.ataques_especiais;

import decorator.DanoCausadoDecorador;
import personagens.DanoCausado;

public class Veneno extends DanoCausadoDecorador {

  public Veneno(DanoCausado danoCausado) {
    super(danoCausado);
    System.out.println("Veneno Aumentando poder em 25%");
    setDano(1.25);
  }

  

}
