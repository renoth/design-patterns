package de.renoth.adapter;

public class Adapter implements TargetInterface {
    private final AdapteeInterface adaptee;

    public Adapter() {
        this.adaptee = new Adaptee();
    }

    @Override
    public void targetMethod() {
        System.out.println("Translating request ...");
        adaptee.adapteeMethod();
    }
}
