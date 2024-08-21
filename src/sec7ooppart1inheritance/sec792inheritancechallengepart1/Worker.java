package sec7ooppart1inheritance.sec792inheritancechallengepart1;

import java.time.LocalDate;

public class Worker {
    protected String name;
    private String birthDate;
    protected String endDate;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        return LocalDate.now().getYear() - LocalDate.parse(birthDate).getYear();
    }

    public double collectPay() {
        return 50.0;
    }

    public void terminate(String endDate) {
        System.out.println("Employee is terminated as of " + endDate);
        this.endDate = endDate;
    }
}
