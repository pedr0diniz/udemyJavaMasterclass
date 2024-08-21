package sec7ooppart1inheritance.sec792inheritancechallengepart1;

public class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, long employeeId, String hireDate, double hourlyPayRate) {
        super(name, birthDate, employeeId, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay() {
        System.out.println(name + " is collecting the payment equivalent to 176 hours (1 month)");
        return hourlyPayRate * 176;
    }

    public double getDoublePay() {
        double doublePay = 2 * collectPay();
        System.out.println("Getting double pay! $" + doublePay);

        return doublePay;
    }
}
