package fr.uvsq21914172.pglp32;

public abstract class AEmployee {
  protected int anciennete;

  public AEmployee(int anciennete) {
    this.anciennete = anciennete;
  }

  public void addYear() {
    anciennete++;
  }

  public abstract double calc_salary();

}
