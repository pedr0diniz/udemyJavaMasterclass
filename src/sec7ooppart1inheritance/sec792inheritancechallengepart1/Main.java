package sec7ooppart1inheritance.sec792inheritancechallengepart1;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee(
                "Pedro",
                "1993-02-19",
                1L,
                "2022-11-07",
                165000.0
        );

        System.out.println(salariedEmployee.getAge());
        System.out.println(salariedEmployee.collectPay());
        salariedEmployee.retire();
        System.out.println(salariedEmployee.collectPay());

        HourlyEmployee hourlyEmployee = new HourlyEmployee(
                "Amanda",
                "1994-10-16",
                2L,
                "2022-05-01",
                20.0
        );

        System.out.println(hourlyEmployee.getAge());
        System.out.println(hourlyEmployee.collectPay());
        hourlyEmployee.getDoublePay();
    }
}
