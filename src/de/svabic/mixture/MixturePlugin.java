package de.svabic.mixture;

import de.svabic.mixture.aura.Aura;
import de.svabic.mixture.aura.OtherAura;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.util.Vector;
import sh99.persistence.task.Task;


public class MixturePlugin implements Task
{
    @Override
    public void definition()
    {
        for( Player :Bukkit.getOnlinePlayers()) {
            Aura aura = new OtherAura();

            Location l = p.getLocation().clone().add(new Vector());

        }

    }
}
