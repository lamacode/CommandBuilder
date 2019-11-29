package de.unrecht.commandbuilder.command;

import org.bukkit.entity.Player;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author unrecht
 * @since 27.11.2019 11:04
 * Copyright © 2019 | unrecht | All rights reserved.
 */

public interface ICommand {

    void onCommand(Player player, String[] args);

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    @interface Info {
        String name();
        String description() default "no description";
    }
}
