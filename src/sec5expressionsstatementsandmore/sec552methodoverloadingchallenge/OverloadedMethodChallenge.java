package sec5expressionsstatementsandmore.sec552methodoverloadingchallenge;

public class OverloadedMethodChallenge {

    public static double convertToCentimeters(int inches) {
        double cm = inches * 2.54;
        System.out.println("Converting " + inches + "in to " + cm + "cm.\n");
        return cm;
    }

    public static double convertToCentimeters(int feet, int inches) {
        double cm = convertToCentimeters((feet * 12) + inches);
        System.out.println("Converting " + feet + "ft and " + inches + "in to " + cm + "cm.");
        return cm;
    }

    public static void main(String[] args) {
        convertToCentimeters(6, 0);
        convertToCentimeters(72);
    }
}
