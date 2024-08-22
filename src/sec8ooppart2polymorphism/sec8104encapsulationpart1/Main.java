package sec8ooppart2polymorphism.sec8104encapsulationpart1;

public class Main {
    public static void main(String[] args) {
        UnencapsulatedPlayer unencapsulatedPlayer = new UnencapsulatedPlayer();
//        player.name = "Tim";
        unencapsulatedPlayer.fullName = "Tim";
        unencapsulatedPlayer.health = 20;
        unencapsulatedPlayer.weapon= "Sword";

        int damage = 10;
        unencapsulatedPlayer.loseHealth(damage);
        System.out.println("Remaining health = " + unencapsulatedPlayer.healthRemaining());

        unencapsulatedPlayer.health = 200;

        unencapsulatedPlayer.loseHealth(11);
        System.out.println("Remaining health = " + unencapsulatedPlayer.healthRemaining());

        EncapsulatedPlayer encapsulatedPlayer = new EncapsulatedPlayer("Tim", 200, "Sword");
        System.out.println("Initial health is " + encapsulatedPlayer.healthPercentageRemaining());
    }
}
