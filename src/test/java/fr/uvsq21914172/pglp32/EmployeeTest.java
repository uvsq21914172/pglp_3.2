package fr.uvsq21914172.pglp32;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.uvsq21914172.pglp32.AEmployee;
import fr.uvsq21914172.pglp32.Employee;
import fr.uvsq21914172.pglp32.Manager;
import fr.uvsq21914172.pglp32.Vendor;

public class EmployeeTest {

  @Test
  public void testSalaryEmployee1() {
    AEmployee e = new Employee(0);
    assertEquals(1500.0, e.calc_salary());
  }

  @Test
  public void testSalaryEmployee2() {
    AEmployee e = new Employee(10);
    assertEquals(1500.0 + 10 * 20, e.calc_salary());
  }

  @Test
  public void testSalaryManager1() {
    AEmployee e = new Manager(0, 0);
    assertEquals(1500.0, e.calc_salary());
  }

  @Test
  public void testSalaryManager2() {
    AEmployee e = new Manager(0, 10);
    assertEquals(1500.0 + 10 * 100, e.calc_salary());
  }

  @Test
  public void testSalaryManager3() {
    AEmployee e = new Manager(10, 0);
    assertEquals(1500.0 + 10 * 20, e.calc_salary());
  }

  @Test
  public void testSalaryVendor1() {
    AEmployee e = new Vendor(0);
    assertEquals(1500.0, e.calc_salary());
  }

  @Test
  public void testSalaryVendor2() {
    AEmployee e = new Vendor(10);
    assertEquals(1500.0 + 10 * 20, e.calc_salary());
  }

  @Test
  public void testSalaryVendor3() {
    Vendor a = new Vendor(0);
    a.setCommission(1500);
    AEmployee e = a;
    assertEquals(1500.0 + 1500, e.calc_salary());
  }

}
