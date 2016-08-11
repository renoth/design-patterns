package de.renoth.adapter;

public class Adaptee implements AdapteeInterface {
    @Override
    public void adapteeMethod() {
        System.out.println("I am the adaptee doing adaptee stuff!");
    }
}
