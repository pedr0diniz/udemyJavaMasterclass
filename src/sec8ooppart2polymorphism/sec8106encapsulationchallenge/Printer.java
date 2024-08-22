package sec8ooppart2polymorphism.sec8106encapsulationchallenge;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private final boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel > 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public Printer(boolean duplex) {
        this(100, duplex);
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount < 0 || tonerAmount + this.tonerLevel > 100) {
            return -1;
        }

        this.tonerLevel += tonerAmount;

        return this.tonerLevel;
    }

    public int printPages(int pagesToPrint) {
        if (pagesToPrint > 0) {
            this.pagesPrinted += pagesToPrint;

            if (this.duplex) {
                System.out.println("This is a duplex printer! One sheet will have two pages!");
                return (pagesToPrint / 2) + (pagesToPrint % 2);
            }

            return pagesToPrint;
        }

        return 0;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
