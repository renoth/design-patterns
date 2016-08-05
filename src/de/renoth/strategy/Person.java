package de.renoth.strategy;

public class Person {
    private TalkBehaviour talkBehaviour;

    public void talk() {
        talkBehaviour.saySomething();
    }

    public void setTalkBehaviour(TalkBehaviour talkBehaviour) {
        this.talkBehaviour = talkBehaviour;
    }
}
