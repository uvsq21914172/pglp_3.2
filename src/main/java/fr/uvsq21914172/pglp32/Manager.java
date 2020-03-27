package fr.uvsq21914172.pglp32;

public class Manager extends AEmployee {
  private int subordonnes;

  public Manager(int anciennete, int subordonnes) {
    super(anciennete);
    this.subordonnes = subordonnes;
  }

  @Override
  public double calc_salary() {
    return 1500 + anciennete * 20 + 100 * subordonnes;
  }
}
