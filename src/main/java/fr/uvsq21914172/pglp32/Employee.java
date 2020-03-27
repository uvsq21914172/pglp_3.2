package fr.uvsq21914172.pglp32;

public class Employee extends AEmployee {

  public Employee(int anciennete) {
    super(anciennete);
  }

  @Override
  public double calc_salary() {
    return 1500 + anciennete * 20;
  }
}
