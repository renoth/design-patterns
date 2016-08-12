package de.renoth.template;

public abstract class AbstractPrinter {
    abstract void printString(String s);

    void beginPrinting() {
        System.out.println("Begin printing ...");
    }

    void endPrinting() {
        System.out.println("... complete");
    }

    public void printFormattedString(String s) {
        beginPrinting();
        printString(s);
        endPrinting();
    }
}
