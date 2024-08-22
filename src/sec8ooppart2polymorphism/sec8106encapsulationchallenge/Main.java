package sec8ooppart2polymorphism.sec8106encapsulationchallenge;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getPagesPrinted());

        int pagesToPrint = 5;
        int sheetsUsed = printer.printPages(pagesToPrint);
        System.out.printf(
                "Current Job Printed %d Pages using %d sheets of paper, Printer Total Pages: %d %n%n",
                pagesToPrint,
                sheetsUsed,
                printer.getPagesPrinted()
        );

        int pagesToPrint2 = 10;
        int sheetsUsed2 = printer.printPages(pagesToPrint2);
        System.out.printf(
                "Current Job Printed %d Pages using %d sheets of paper, Printer Total Pages: %d %n%n",
                pagesToPrint2,
                sheetsUsed2,
                printer.getPagesPrinted()
        );
    }
}
