package sec7ooppart1inheritance.sec779classeschallengeexercise;

public class Main {

    public static void main(String[] args) {
//        BankAccount account = new BankAccount();
//        account.setEmail("pgdneto@gmail.com");
//        account.setNumber("01234");
//        account.setCustomerName("Pedro Gurgel Diniz Neto");
//        account.setPhoneNumber("+5584996327131");

//        BankAccount account = new BankAccount(
//                "01234",
//                0.0,
//                "Pedro Diniz",
//                "zinid@email.com",
//                "+5584996327131"
//        );

        BankAccount account = new BankAccount();

        account.deposit(-1);
        account.deposit(0);
        account.deposit(100.00);
        account.withdraw(-100.00);
        account.withdraw(200.00);
        account.withdraw(59.00);

        account.describeAccount();

        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com", "5511999998888");
        timsAccount.describeAccount();
    }
}
