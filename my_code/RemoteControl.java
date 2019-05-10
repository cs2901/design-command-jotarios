package com.utec.design.patterns;

import com.utec.design.patterns.commands.Command;

import java.util.HashMap;

public class RemoteControl {
    HashMap<String, Command> commandMap = new HashMap<>();

    public void register(String commandName, Command command) {
        commandMap.put(commandName, command);
    }

    public void execute(String commandName) {
        Command command = commandMap.get(commandName);

        if (command == null) {
            System.out.println("El comando no está disponible.");
            return;
        }

        command.execute();
    }
}
