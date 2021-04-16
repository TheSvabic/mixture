package de.svabic.mixture.config;

import org.bukkit.plugin.Plugin;
import sh99.persistence.configuration.AbstractConfiguration;
import sh99.persistence.configuration.Configuration;
import sh99.persistence.storage.resource.YmlResource;

public class AuraConfiguration extends AbstractConfiguration implements Configuration
{
    private boolean enabled = true;

    public AuraConfiguration(YmlResource resource, Plugin plugin) { super(resource, plugin);}

    public void setEnabled(boolean enabled) {this.enabled = enabled;}

    public boolean isEnabled() { return  enabled; }


}
