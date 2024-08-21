package sec7ooppart1inheritance.sec782constructorchallengeexercise;

public class ConstructorChallenge {
    private final String name;
    private final double creditLimit;
    private final String emailAddress;

    public ConstructorChallenge(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public ConstructorChallenge() {
        this("Default name", "default@email.com");
    }

    public ConstructorChallenge(String name, String emailAddress) {
        this(name, 10000.0, emailAddress);
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "ConstructorChallenge{" +
                "name='" + name + '\'' +
                ", creditLimit=" + creditLimit +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ConstructorChallenge struct1 = new ConstructorChallenge("Pedro", 9999.99, "pedro@email.com");
        ConstructorChallenge struct2 = new ConstructorChallenge();
        ConstructorChallenge struct3 = new ConstructorChallenge("Amanda", "amanda@email.com");

        System.out.println(struct1);
        System.out.println(struct2);
        System.out.println(struct3);
    }
}