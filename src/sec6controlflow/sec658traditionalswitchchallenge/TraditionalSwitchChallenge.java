package sec6controlflow.sec658traditionalswitchchallenge;

public class TraditionalSwitchChallenge {
    public static void main(String[] args) {
        System.out.println(natoAlphabet('A'));
        System.out.println(natoAlphabet('B'));
        System.out.println(natoAlphabet('C'));
        System.out.println(natoAlphabet('D'));
        System.out.println(natoAlphabet('E'));
        System.out.println(natoAlphabet('F'));

    }

    public static String natoAlphabet(char value) {
        String returnValue = "";

        switch(value) {
            case 'A':
                returnValue = "A = Able";
                break;
            case 'B':
                returnValue = "B = Baker";
                break;
            case 'C':
                returnValue = "C = Charlie";
                break;
            case 'D':
                returnValue = "D = Dog";
                break;
            case 'E':
                returnValue = "E = Easy";
                break;
            default:
                returnValue = "Letter" + value + " was not found in the switch";
        }

        return returnValue;
    }
}
