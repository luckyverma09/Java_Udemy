public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;         // if tonerLevel is between 0 and 100, then tonerLevel = tonerLevel, else tonerLevel = -1
        this.duplex = duplex;
    }

    public int printPages(int pages){
        int jobPages = (duplex) ? (pages /2 ) + (pages % 2) : pages;        // if duplex is true, then jobPages = pages / 2 + pages % 2
        pagesPrinted += jobPages;
        return jobPages;
    }
    public int addToner(int tonerAmount){
        int tempAmount = tonerAmount + tonerLevel;
        if(tempAmount > 100 || tempAmount < 0){
            return -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }
}
