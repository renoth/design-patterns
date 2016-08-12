package de.renoth.template;

public class AllLowercasePrinter extends AbstractPrinter {
    @Override
    void printString(String s) {
        System.out.println(s.toLowerCase());
    }
}
