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
  Estado estado;

  public String getEstado() {
    return "Estado [" + estado.getClass().getSimpleName() + "]";
  }

  public void setEstado(Estado estado) {
    this.estado = estado;
  }

  public void setVida(double vida) {
    this.vida = vida;
  }

  public double getVida() {
    // System.out.println("Vida: " + vida);
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

  public void getEscudos() {
    System.err.println(getNome() + " - Escudo Ouro: " + this.escudoOuro + " Escudo Prata: " + this.escudoPrata +
        " Escudo Bronze: " + this.escudoBronze);
  }

  public double calculaDano(Dano d) {
    Escudo esc = new EscudoOuro(new EscudoPrata(new EscudoBronze(new SemEscudo(), this.escudoBronze), this.escudoPrata),
        this.escudoOuro);
    System.out.println(getNome() + " recebeu [" + esc.processaDano(d) + "] de dano");
    return esc.processaDano(d);
  }

  public void receberDano(int valor) {
    Dano d = new Dano(Math.abs(valor));
    double dano = calculaDano(d);
    estado.diminuirVida(dano);
    // System.out.println("Vida atual: [" + getVida() + "]\n");
    // System.out.println("Estado [" + estado.getClass().getSimpleName() + "]");
  }

  public void curarVida(int valor) {
    if (getVida() + valor <= 100) {
      System.out.println(getNome() + " curou [" + valor + "] de vida");
      estado.aumentarVida(valor);
    } else {
      System.out.println(getNome() + " curou [" + (100 - getVida()) + "] de vida");
      estado.aumentarVida(100 - getVida());
    }
    // System.out.println("Vida atual: [" + getVida() + "]\n");
    // System.out.println("Estado [" + estado.getClass().getSimpleName() + "]");
  }

}
