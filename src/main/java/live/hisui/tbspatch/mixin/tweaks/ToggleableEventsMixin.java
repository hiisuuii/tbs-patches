package live.hisui.tbspatch.mixin.tweaks;

import com.llamalad7.mixinextras.expression.Definition;
import com.llamalad7.mixinextras.expression.Expression;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import live.hisui.tbspatch.Config;
import net.mcreator.interpritation.procedures.EventEngineProcedure;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(EventEngineProcedure.class)
public class ToggleableEventsMixin {

    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 1.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableDamageLook(boolean original) {
        if(Config.damageLookAroundEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 2.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableDamage(boolean original) {
        if(Config.damageEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 3.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableNightAndSongEvent(boolean original) {
        if(Config.nightEffectsEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 4.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableIgniteEvent(boolean original) {
        if(Config.fireEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 5.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableLightningEvent(boolean original) {
        if(Config.lightningStrikeEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 6.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableGrassSoundsEvent(boolean original) {
        if(Config.grassBreakingSoundsEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 7.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableHeartbeatEvent(boolean original) {
        if(Config.nightCaveSoundsEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 8.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableHungerEvent(boolean original) {
        if(Config.hungerEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 9.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableGuiCloseEvent(boolean original) {
        if(Config.closeGuiEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 10.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableNullScreenEvent(boolean original) {
        if(Config.nullScreensEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 11.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableChatMessageEvent(boolean original) {
        if(Config.chatMessagesEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 12.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION"), remap = false)
    private static boolean configDisablePlayOrStopsoundEvent(boolean original) {
        if(Config.soundEffectsEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 13.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION"), remap = false)
    private static boolean configDisableNullAdvancementEvent(boolean original) {
        if(Config.nullAdvancementEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 14.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableNullBookEvent(boolean original) {
        if(Config.nullBookEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 16.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableNullTitleEvent(boolean original) {
        if(Config.nullDisplayEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 17.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableBedrockSkyEvent(boolean original) {
        if(Config.bedrockPlacementEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 18.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableWaterSkyEvent(boolean original) {
        if(Config.waterPlacementEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 19.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableExplosionEvent(boolean original) {
        if(Config.explosionEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 20.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableChangeTimeEvent(boolean original) {
        if(Config.timeChangeEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 21.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableNullJumpscareEvent(boolean original) {
        if(Config.nullJumpscareEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 21.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 1), remap = false)
    private static boolean configDisableXPEvent(boolean original) {
        if(Config.xpRewardEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 22.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableDisc11Event(boolean original) {
        if(Config.discRewardEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 23.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableRandomRotateEvent(boolean original) {
        if(Config.randomRotationEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 24.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableClanVoidTeleporterEvent(boolean original) {
        if(Config.voidDimensionBlockEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 25.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableRedstoneTorchEvent(boolean original) {
        if(Config.redstoneTorchEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 26.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableBlankSignEvent(boolean original) {
        if(Config.blankSignEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 27.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableSpawnWaterEvent(boolean original) {
        if(Config.waterSpawnEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 27.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 1), remap = false)
    private static boolean configDisableChangeSpawnEvent(boolean original) {
        if(Config.spawnSetEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 28.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableEveningTimeEvent(boolean original) {
        if(Config.eveningTimeEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 29.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableRandomPushEvent(boolean original) {
        if(Config.randomPushEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 30.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableBlackParticlesEvent(boolean original) {
        if(Config.blackParticlesEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 31.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableBlackBlockScreenEvent(boolean original) {
        if(Config.blackBoxEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 32.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableHelloBlock(boolean original) {
        if(Config.helloBlockEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 33.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableExplodingBlockEvent(boolean original) {
        if(Config.explodingBlockEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 34.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configGoodLuckScreen(boolean original) {
        if(Config.goodLuckScreenEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 35.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableNullLurkerEvent(boolean original) {
        if(Config.nullSpawnEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 36.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableToggleDaylightCycleEvent(boolean original) {
        if(Config.daylightCycleEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 37.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableBSODEvent(boolean original) {
        if(Config.fakeBsodEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 38.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableObfuscatedSignEvent(boolean original) {
        if(Config.obfuscatedSignEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 39.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableDiamondsGiftEvent(boolean original) {
        if(Config.diamondChestEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 40.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableGLErrorEvent(boolean original) {
        if(Config.openglErrorEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 41.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableNetherrackInBaseEvent(boolean original) {
        if(Config.netherrackBlockEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 41.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 1), remap = false)
    private static boolean configDisableAirInBaseEvent(boolean original) {
        if(Config.blockRemovalEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 42.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableVHSFilterSwitchEvent(boolean original) {
        if(Config.vhsFilterEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 43.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableBlackDotsEvent(boolean original) {
        if(Config.blackDotsEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 44.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableEyesEvent(boolean original) {
        if(Config.spookyEyesEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 45.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableSmileyEvent(boolean original) {
        if(Config.smileyChatEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 46.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableDoorSoundsEvent(boolean original) {
        if(Config.doorSoundsEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 47.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableMoonSoundEvent(boolean original) {
        if(Config.moonSoundEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 48.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableLeaveEffectEvent(boolean original) {
        if(Config.leavePotionEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 49.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableHearMeEvent(boolean original) {
        if(Config.hearMeAdvancementEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 50.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableFakeVillagerEvent(boolean original) {
        if(Config.fakeVillagerEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 51.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableCorruptMoonEvent(boolean original) {
        if(Config.brokenMoonEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 52.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableLavaCastEvent(boolean original) {
        if(Config.lavaCastEvent) {
            return false;
        }
        return original;
    }
    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 53.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "MIXINEXTRAS:EXPRESSION", ordinal = 0), remap = false)
    private static boolean configDisableLavaPlacementEvent(boolean original) {
        if(Config.lavaPlacementEvent) {
            return false;
        }
        return original;
    }

    @Definition(id = "eventengine", local = @Local(type = double.class, name = "eventengine"))
    @Expression("eventengine == 54.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
    at = @At("MIXINEXTRAS:EXPRESSION"), remap = false)
    private static boolean configDisableShadowCubeEvent(boolean original) {
        if(Config.shadowCubeEvent) {
            return false;
        }
        return original;
    }

}
