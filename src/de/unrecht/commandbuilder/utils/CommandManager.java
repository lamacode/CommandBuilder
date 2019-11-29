package de.unrecht.commandbuilder.utils;

import de.unrecht.commandbuilder.command.ICommand;

/**
 * @author unrecht
 * @since 27.11.2019 11:11
 * Copyright © 2019 | unrecht | All rights reserved.
 */

public class CommandManager extends Manager<ICommand> {

    public CommandManager() { }

    public void registerCommand(ICommand... commands) {
        for (ICommand command : commands) {
            Class<?> commandClass = command.getClass();
            if (commandClass.isAnnotationPresent(ICommand.Info.class)) {
                String name = commandClass.getAnnotation(ICommand.Info.class).name();
                this.addToList(command);
            }
        }
    }

    public void unregisterCommand(ICommand... commands) {
        for (ICommand command : commands) {
            Class<?> commandClass = command.getClass();
            if (commandClass.isAnnotationPresent(ICommand.Info.class)) {
                String name = commandClass.getAnnotation(ICommand.Info.class).name();
                if (list.contains(command)) {
                    list.remove(command);
                }
            }
        }
    }
}
