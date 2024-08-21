package sec7ooppart1inheritance.sec792inheritancechallengepart1;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double annualSalary;

    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, long employeeId, String hireDate, double annualSalary) {
        super(name, birthDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {
        System.out.println(name + " is collecting his monthly salary");
        return isRetired ? 9000.0 : 10000.0;
    }

    public void retire() {
        isRetired = true;
        System.out.println("Retiring employee");
        super.terminate(LocalDate.now().toString());
    }
}
