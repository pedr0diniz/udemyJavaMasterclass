package sec5expressionsstatementsandmore.sec555exercises;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        return ((summer && temperature > 24 && temperature < 46) || (!summer && temperature > 24 && temperature < 36));
    }
}
