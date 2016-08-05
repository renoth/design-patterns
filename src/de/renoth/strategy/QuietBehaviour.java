package de.renoth.strategy;

public class QuietBehaviour implements TalkBehaviour {
    @Override
    public void saySomething() {
        System.out.println("...");
    }
}
