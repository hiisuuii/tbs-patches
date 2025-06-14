package live.hisui.tbspatch.mixin.fixes;

import net.mcreator.interpritation.client.gui.ConfigScreen;
import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
import net.mcreator.interpritation.world.inventory.ConfigMenu;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(value = ConfigScreen.class)
public abstract class HorribleConfigScreenFixingMixin extends AbstractContainerScreen<ConfigMenu> {
    @Shadow(remap = false) @Final private Level world;

    public HorribleConfigScreenFixingMixin(ConfigMenu p_97741_, Inventory p_97742_, Component p_97743_) {
        super(p_97741_, p_97742_, p_97743_);
    }

    @ModifyArg(method = "init", at = @At(value = "INVOKE",
            target = "Lnet/minecraft/client/gui/components/Checkbox;<init>(IIIILnet/minecraft/network/chat/Component;Z)V",
            ordinal = 0)
    )
    private boolean entitiesBox(boolean original){
        return ThebrokenscriptModVariables.MapVariables.get(this.world).config_noentitiesspawn;
    }
    @ModifyArg(method = "init", at = @At(value = "INVOKE",
            target = "Lnet/minecraft/client/gui/components/Checkbox;<init>(IIIILnet/minecraft/network/chat/Component;Z)V",
            ordinal = 1)
    )
    private boolean eventsBox(boolean original){
        return ThebrokenscriptModVariables.MapVariables.get(this.world).config_randomevents;
    }
    @ModifyArg(method = "init", at = @At(value = "INVOKE",
            target = "Lnet/minecraft/client/gui/components/Checkbox;<init>(IIIILnet/minecraft/network/chat/Component;Z)V",
            ordinal = 2)
    )
    private boolean crashesBox(boolean original){
        return ThebrokenscriptModVariables.MapVariables.get(this.world).config_nocrashes;
    }
    @ModifyArg(method = "init", at = @At(value = "INVOKE",
            target = "Lnet/minecraft/client/gui/components/Checkbox;<init>(IIIILnet/minecraft/network/chat/Component;Z)V",
            ordinal = 3)
    )
    private boolean jumpscaresBox(boolean original){
        return ThebrokenscriptModVariables.MapVariables.get(this.world).config_norandomjumpscare;
    }
    @ModifyArg(method = "init", at = @At(value = "INVOKE",
            target = "Lnet/minecraft/client/gui/components/Checkbox;<init>(IIIILnet/minecraft/network/chat/Component;Z)V",
            ordinal = 4)
    )
    private boolean structuresBox(boolean original){
        return ThebrokenscriptModVariables.MapVariables.get(this.world).config_norandomstructures;
    }
    @ModifyArg(method = "init", at = @At(value = "INVOKE",
            target = "Lnet/minecraft/client/gui/components/Checkbox;<init>(IIIILnet/minecraft/network/chat/Component;Z)V",
            ordinal = 5)
    )
    private boolean vhsBox(boolean original){
        return !ThebrokenscriptModVariables.MapVariables.get(this.world).showvhs;
    }
    @ModifyArg(method = "init", at = @At(value = "INVOKE",
            target = "Lnet/minecraft/client/gui/components/Checkbox;<init>(IIIILnet/minecraft/network/chat/Component;Z)V",
            ordinal = 6)
    )
    private boolean banningBox(boolean original){
        return ThebrokenscriptModVariables.MapVariables.get(this.world).config_noban;
    }
    @ModifyArg(method = "init", at = @At(value = "INVOKE",
            target = "Lnet/minecraft/client/gui/components/Checkbox;<init>(IIIILnet/minecraft/network/chat/Component;Z)V",
            ordinal = 7)
    )
    private boolean blockBreakingBox(boolean original){
        return ThebrokenscriptModVariables.MapVariables.get(this.world).config_noblockbreaking;
    }
    @ModifyArg(method = "init", at = @At(value = "INVOKE",
            target = "Lnet/minecraft/client/gui/components/Checkbox;<init>(IIIILnet/minecraft/network/chat/Component;Z)V",
            ordinal = 8)
    )
    private boolean baseExplodingBox(boolean original){
        return ThebrokenscriptModVariables.MapVariables.get(this.world).config_nobaseexplode;
    }

}
