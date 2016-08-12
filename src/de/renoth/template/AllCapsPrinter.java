package de.renoth.template;

public class AllCapsPrinter extends AbstractPrinter {
    @Override
    void printString(String s) {
        System.out.println(s.toUpperCase());
    }
}
