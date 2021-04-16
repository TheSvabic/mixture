package de.svabic.mixture.aura;

import org.bukkit.Particle;

public class OtherAura implements Aura
{
    @Override
    public Particle particle() {return Particle.WATER_BUBBLE;}

    @Override
    public int amount() { return 5; }

}