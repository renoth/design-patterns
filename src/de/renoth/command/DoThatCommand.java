package de.renoth.command;

public class DoThatCommand implements Command {
    @Override
    public void execute() {
        System.out.println("THAT!!!!");
    }
}
