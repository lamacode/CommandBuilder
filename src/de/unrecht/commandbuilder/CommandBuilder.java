package de.unrecht.commandbuilder;

import de.unrecht.commandbuilder.listeners.CommandProcess;
import de.unrecht.commandbuilder.utils.CommandManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author unrecht
 * @since 27.11.2019 15:14
 * Copyright © 2019 | unrecht | All rights reserved.
 */

public class CommandBuilder extends JavaPlugin {

    public static final CommandManager CMD_MANAGER = new CommandManager();

    @Override
    public void onEnable() {
        new CommandProcess(CMD_MANAGER, this);
    }
}
