package sec6controlflow.sec669exercises;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;

        int packWeight = 0;
        for (int i = 0; i < bigCount && (packWeight + 5) <= goal; i++) {
            packWeight += 5;
        }

        return (packWeight == goal || packWeight + smallCount >= goal);
    }
}
