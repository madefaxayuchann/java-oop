package programmer.zaman.now.applications;

import programmer.zaman.now.data.Company;

public class CompanyApp {
  //  inner class is a class in class inner class cant access private method on outer class
  public static void main(String[] args) {
    Company company = new Company();
    company.setName("Programmer Zaman Now");

    Company.Employee employee = company.new Employee();
    employee.setName("Ayumi");

    System.out.println(employee.getName());
    System.out.println(employee.getCompany());
  }
}
