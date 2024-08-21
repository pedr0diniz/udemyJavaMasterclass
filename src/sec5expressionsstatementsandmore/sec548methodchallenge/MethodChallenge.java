package sec5expressionsstatementsandmore.sec548methodchallenge;

public class MethodChallenge {
    public static void main(String[] args) {
        displayHighScorePosition("Amanda", calculateHighScorePosition(1500));
        displayHighScorePosition("Pedro", calculateHighScorePosition(1000));
        displayHighScorePosition("Jade", calculateHighScorePosition(500));
        displayHighScorePosition("Tina", calculateHighScorePosition(100));
        displayHighScorePosition("Maru", calculateHighScorePosition(25));

        System.out.println();

        displayHighScorePosition("Amanda", calculateHighScorePosition(1500));
        displayHighScorePosition("Pedro", calculateHighScorePosition(999));
        displayHighScorePosition("Jade", calculateHighScorePosition(499));
        displayHighScorePosition("Tina", calculateHighScorePosition(99));
        displayHighScorePosition("Maru", calculateHighScorePosition(-1000));
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int score) {
        int result = 4;
        if (score >= 1000) {
            result = 1;
        } else if (score >= 500) {
            result = 2;
        } else if (score >= 100) {
            result = 3;
        }

        return result;
    }
}
