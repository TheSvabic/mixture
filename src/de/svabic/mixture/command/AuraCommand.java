package de.svabic.mixture.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import sh99.persistence.metadata.MetaDataHandler;

public class AuraCommand implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings)
    {
        if(commandSender instanceof Player) {
            Player player = (Player) commandSender;
            Object auraActivation = MetaDataHandler.get(null, player, "aura");
        }
            return true;

    }

}
