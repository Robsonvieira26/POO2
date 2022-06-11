package personagens;

import chain.Escudo;
import chain.EscudoBronze;
import strategy.Atacar;
import strategy.Correr;
import strategy.Pular;
import chain.EscudoOuro;
import chain.EscudoPrata;
import chain.SemEscudo;

public abstract class Personagem {
  private String nome;
  private Atacar atacar;
  private Correr correr;
  private Pular pular;
  private double vida;
  private int escudoOuro, escudoPrata, escudoBronze;

  public void setVida(double vida) {
    this.vida = vida;
  }

  public double getVida() {
    return vida;
  }

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

  public void setEscudoOuro(int valor) {
    this.escudoOuro = valor;
  }

  public void setEscudoPrata(int valor) {
    this.escudoPrata = valor;
  }

  public void setEscudoBronze(int valor) {
    this.escudoBronze = valor;
  }

  public double receberDano(Dano d) {
    Escudo esc = new EscudoOuro(new EscudoPrata(new EscudoBronze(new SemEscudo(), this.escudoBronze), this.escudoPrata),
        this.escudoOuro);
    System.out.println(getNome() + " recebeu [" + esc.processaDano(d) + "] de dano");
    return esc.processaDano(d);

  }
}
