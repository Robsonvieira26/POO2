package personagens;

import chain.Escudo;
import strategy.Atacar;
import strategy.Correr;
import strategy.Pular;
import chain.EscudoOuro;
import chain.SemEscudo;

public abstract class Personagem {
  private String nome;
  private Atacar atacar;
  private Correr correr;
  private Pular pular;
  private double vida;
  private int escudos[];

  public int[] getEscudos() {
    return escudos;
  }

  public void setEscudos(int[] escudos) {
    this.escudos = escudos;
  }

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

  public double receberDano(Dano d) {
    Escudo esc = new EscudoOuro(new SemEscudo(), escudos[0]);
    System.out.println(getNome() + " recebeu [" + esc.processaDano(d) + "] de dano");
    return esc.processaDano(d);

  }
}
