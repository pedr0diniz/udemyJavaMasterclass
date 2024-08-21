package sec5expressionsstatementsandmore.sec551methodoverloading;

public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("ziniD", 500);
        System.out.println("New score is " + newScore);

        System.out.println("New score is " + calculateScore(75));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        return calculateScore("Anonymous", score);
    }

    public static int calculateScore() {
        System.out.println("No player name or score");
        return 0;
    }
}
