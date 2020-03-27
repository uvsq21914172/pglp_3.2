package fr.uvsq21914172.pglp32;

public class Vendor extends AEmployee {
  private int commission;

  public Vendor(int anciennete) {
    super(anciennete);
    commission = 0;
  }

  @Override
  public double calc_salary() {
    return 1500 + anciennete * 20 + commission;
  }

  public int getCommission() {
    return commission;
  }

  public void setCommission(int commission) {
    this.commission = commission;
  }

}
