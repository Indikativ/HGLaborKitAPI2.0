package de.hglabor.plugins.kitapi.kit.config;

public enum KitMetaData {
    INGLADIATOR,
    GLADIATOR_BLOCK,
    SWITCHER_BALL,
    GRAPPLER_ARROW,
    KITPLAYER_IS_IN_COMBAT,
    FEAST_BLOCK,
    UNBREAKABLE_BLOCK,
    SPIT_SOUP,
    SPIT_PROJECTILE,
    SPIDERMAN_SNOWBALL,
    MANIPULATED_MOB;

    public String getKey() {
        return name();
    }
}
