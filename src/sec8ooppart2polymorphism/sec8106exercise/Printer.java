package sec8ooppart2polymorphism.sec8106exercise;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private final boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel > -1 && tonerLevel < 101) ? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        int totalToner = this.tonerLevel + tonerAmount;
        if (tonerAmount <= 0 || tonerAmount > 100 || totalToner > 100) return -1;

        this.tonerLevel = totalToner;

        return this.tonerLevel;
    }

    public int printPages(int pagesToPrint) {
        int printedPages = duplex ? (pagesToPrint / 2) + (pagesToPrint % 2) : pagesToPrint;

        this.pagesPrinted += printedPages;
        return printedPages;
    }

    public int getPagesPrinted() {
        return this.pagesPrinted;
    }
}
