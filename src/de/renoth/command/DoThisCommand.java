package de.renoth.command;

public class DoThisCommand implements Command {
    @Override
    public void execute() {
        System.out.println("THIS!");
    }
}
