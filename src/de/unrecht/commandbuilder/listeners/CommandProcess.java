package de.unrecht.commandbuilder.listeners;

        import de.unrecht.commandbuilder.CommandBuilder;
        import de.unrecht.commandbuilder.command.ICommand;
        import de.unrecht.commandbuilder.utils.CommandManager;
        import org.bukkit.Bukkit;
        import org.bukkit.event.EventHandler;
        import org.bukkit.event.Listener;
        import org.bukkit.event.player.PlayerCommandPreprocessEvent;

/**
 * @author unrecht
 * @since 27.11.2019 14:03
 * Copyright © 2019 | unrecht | All rights reserved.
 */

public class CommandProcess implements Listener {

    private CommandManager commandManager;

    public CommandProcess(CommandManager commandManager, CommandBuilder commandBuilder) {
        this.commandManager = commandManager;
        Bukkit.getPluginManager().registerEvents(this, commandBuilder);
    }

    @EventHandler
    public void cmdProcess(PlayerCommandPreprocessEvent event) {
        String[] args = event.getMessage().substring(1).split(" ");
        commandManager.getList().forEach(cmd -> {
            if (cmd.getClass().isAnnotationPresent(ICommand.Info.class)) {
                String commandName = cmd.getClass().getAnnotation(ICommand.Info.class).name();
                if (args[0].equalsIgnoreCase(commandName)) {
                    cmd.onCommand(event.getPlayer(), args);
                    event.setCancelled(true);
                }
            }
        });
    }
}
