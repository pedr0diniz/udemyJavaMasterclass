package sec6controlflow.sec663exercise;

//public class SumOddRange {
//    public static boolean isOdd(int number) {
//        return number % 2 == 1;
//    }
//
//    public static int sumOdd(int start, int end) {
//        if (start < 1 || end < start) {
//            return -1;
//        }
//
//        int sumOfOddNumbers = 0;
//        for (int i = start; start <= end; i++) {
//            if (isOdd(i)) {
//                sumOfOddNumbers += i;
//            }
//        }
//
//        return sumOfOddNumbers;
//    }
//}
public class SumOddRange {
    public static boolean isOdd(int number) {
        return number % 2 == 1;
    }

    public static int sumOdd(int start, int end) {
        if (start < 1 || end < start) {
            return -1;
        }

        int loopStart = isOdd(start) ? start : start + 1;
        int loopEnd = isOdd(end) ? end : end - 1;

        int oddCount = 0;
        for (int i = loopStart; i <= loopEnd; i += 2) {
            oddCount++;
        }

        return (((loopStart + loopEnd) / 2) * oddCount);
    }
}
