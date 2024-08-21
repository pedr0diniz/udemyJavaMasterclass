package sec7ooppart1inheritance.sec779classeschallengeexercise;

public class BankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("56789", 2.50, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("12345", 100.55, customerName, email, phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String number, double balance, String customerName, String email, String phone) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phone;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double value) {
        if (value > 0) {
            balance += value;
            System.out.println("Deposited $" + value + " to your account. Your current balance is: $" + balance);
        } else {
            System.out.println("Invalid amount. Please deposit a positive value");
        }
    }

    public void withdraw(double value) {
        if (value <= 0) {
            System.out.println("Can't withdraw a negative account. Please input a positive value");
        } else if (value > balance) {
            System.out.println("Can't withdraw more than your current balance. Please input a value up to " + balance);
        } else {
            balance -= value;
            System.out.println("Successfully withdrew $" + value + ". Your current balance is $" + balance);
        }
    }

    public void describeAccount() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
