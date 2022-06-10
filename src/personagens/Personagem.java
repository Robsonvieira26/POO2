package personagens;

import strategy.Atacar;
import strategy.Correr;
import strategy.Pular;

public abstract class Personagem {
  private String nome;
  private Atacar atacar;
  private Correr correr;
  private Pular pular;

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setAtacar(Atacar atacar) {
    this.atacar = atacar;
  }

  public void Atacar() {
    atacar.atacar(nome);
  }

  public void setCorrer(Correr correr) {
    this.correr = correr;
  }

  public void Correr() {
    correr.correr(nome);
  }

  public void setPular(Pular pular) {
    this.pular = pular;
  }

  public void Pular() {
    pular.pular(nome);
  }
}
