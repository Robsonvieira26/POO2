package decorator.ataques_especiais;

import decorator.DanoCausadoDecorador;
import personagens.DanoCausado;

public class EstrelaCaida extends DanoCausadoDecorador {
  public EstrelaCaida(DanoCausado danoCausado) {
    super(danoCausado);
    System.out.println("Estrela Caida Aumentando poder em 400%");
    setDano(4);
  }
}
