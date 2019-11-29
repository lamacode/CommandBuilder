package de.unrecht.commandbuilder.command;

import org.bukkit.entity.Player;

/**
 * @author unrecht
 * @since 27.11.2019 11:16
 * Copyright © 2019 | unrecht | All rights reserved.
 */

@ICommand.Info(name = "Test", description = "test")
public class CommandTest implements ICommand {

    @Override
    public void onCommand(Player player, String[] args) {
        if (args.length == 2) {
            if (args[1].equalsIgnoreCase("hallo")) {
                player.sendMessage("Guten Tag: " + player.getDisplayName());
            }
        } else {
            player.sendMessage("Schade der Command ist falsche eigeben worden.");
        }
    }
}
