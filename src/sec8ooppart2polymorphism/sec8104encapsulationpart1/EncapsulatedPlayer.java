package sec8ooppart2polymorphism.sec8104encapsulationpart1;

public class EncapsulatedPlayer {
    private String name;
    private int healthPercentage;
    private String weapon;

    public EncapsulatedPlayer(String name, int healthPercentage, String weapon) {
        this.name = name;
        this.weapon = weapon;
        if (healthPercentage <= 0) this.healthPercentage = 1;
        else this.healthPercentage = Math.min(healthPercentage, 100);
    }

    public EncapsulatedPlayer(String name) {
        this(name, 100, "Sword");
    }

    public void loseHealth(int damage) {
        healthPercentage -= damage;

        if (healthPercentage <= 0) {
            System.out.println("Player knocked out of game");
        }
    }

    public int healthPercentageRemaining() {
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth) {

        healthPercentage += extraHealth;
        if (healthPercentage > 100) {
            System.out.println("Player restored to 100%");
            healthPercentage = 100;
        }
    }
}
