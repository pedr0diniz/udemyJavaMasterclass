package sec10listarraylistlinkedlistiteratorautoboxing.sec10144autoboxingandunboxingchallenge;

public class Main {

    public static void main(String[] args) {
        Bank c6bank = new Bank("C6 Bank");
        c6bank.addCustomer("Pedro");
        c6bank.addTransaction("Pedro", 1000.00);
        c6bank.addTransaction("Pedro", 500);
        c6bank.addTransaction("Pedro", 4152.80);
        c6bank.addTransaction("Pedro", -1050.00);
        c6bank.addTransaction("Pedro", -213.00);
        c6bank.addTransaction("Pedro", -227.55);
        c6bank.addTransaction("Pedro", -10235.43335534654);

        c6bank.printStatement("Pedro");
    }
}
