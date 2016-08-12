package de.renoth.facade;

public class Facade {
    private ClassA classA;
    private ClassB classB;

    public Facade(ClassA classA, ClassB classB) {
        this.classA = classA;
        this.classB = classB;
    }

    public void runMethodA() {
        classA.methodA();
        classB.methodA();
    }

    public void runMethodB() {
        classA.methodB();
        classB.methodB();
    }
}
