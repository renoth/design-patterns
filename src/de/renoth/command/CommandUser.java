package de.renoth.command;

import java.util.ArrayList;
import java.util.List;

public class CommandUser {
    private List<Command> commands;

    public CommandUser() {
        commands = new ArrayList<>();
    }

    public void receiveCommand(Command command) {
        commands.add(command);
    }

    public void executeCommands() {
        System.out.println("Executing commands ...");
        for(Command c : commands) {
            c.execute();
        }

        commands.clear();
        System.out.println("... done!");

    }
}
