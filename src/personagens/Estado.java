package personagens;

public abstract class Estado {
  protected Personagem personagem;
  private double limiteSuperior, limiteInferior;

  public double getLimiteInferior() {
    return limiteInferior;
  }

  public double getLimiteSuperior() {
    return limiteSuperior;
  }

  public void setLimiteInferior(double limiteInferior) {
    this.limiteInferior = limiteInferior;
  }

  public void setLimiteSuperior(double limiteSuperior) {
    this.limiteSuperior = limiteSuperior;
  }

  protected Estado(Personagem personagem) {
    this.personagem = personagem;
    setLimites();
  }

  protected abstract void setLimites();

  public void diminuirVida(double dano) {
    personagem.setVida(personagem.getVida() - Math.abs(dano));
    verificarAlteracaoEstado();
  }

  public void aumentarVida(double dano) {
    personagem.setVida(personagem.getVida() + Math.abs(dano));
    verificarAlteracaoEstado();
  }

  protected abstract void verificarAlteracaoEstado();
}
