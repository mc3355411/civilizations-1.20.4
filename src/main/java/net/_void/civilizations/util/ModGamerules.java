package net._void.civilizations.util;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.minecraft.world.GameRules;

public class ModGamerules {
    public static final GameRules.Key<GameRules.BooleanRule> TOMBSTONE_ON_DEATH =
            GameRuleRegistry.register("tombstoneOnDeath", GameRules.Category.MISC, GameRuleFactory.createBooleanRule(true));

    public static void initialize() {}
}
