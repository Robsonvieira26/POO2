package state;

import personagens.Estado;
import personagens.Personagem;
import strategy.ataque.ANormal;
import strategy.corrida.CMedio;

public class EstadoNormal extends Estado {
  public EstadoNormal(Personagem personagem) {
    super(personagem);
    personagem.setAtacar(new ANormal());
    personagem.setCorrer(new CMedio());
  }

  @Override
  protected void setLimites() {
    setLimiteInferior(30);
    setLimiteSuperior(70);
  }

  @Override
  public void diminuirVida(double dano) {
    personagem.setVida(personagem.getVida() - Math.abs(dano));
    verificarAlteracaoEstado();
  }

  public void aumentarVida(double dano) {
    personagem.setVida(personagem.getVida() + Math.abs(dano));
    verificarAlteracaoEstado();
  }

  @Override
  protected void verificarAlteracaoEstado() {
    if (personagem.getVida() <= 0) {
      System.out.println(personagem.getNome() + " morreu");
      System.exit(0);
    } else if (personagem.getVida() > 0 && personagem.getVida() <= 29) {
      System.out.println(personagem.getNome() + " esta no estado Perigo");
      personagem.setEstado(new EstadoPerigo(personagem));
    } else if (personagem.getVida() >= 30 && personagem.getVida() <= 70) {
      System.out.println(personagem.getNome() + " esta no estado normal");
      personagem.setEstado(new EstadoNormal(personagem));
    } else if (personagem.getVida() > 70) {
      System.out.println(personagem.getNome() + " esta no estado forte");
      personagem.setEstado(new EstadoForte(personagem));
    }
  }
}
