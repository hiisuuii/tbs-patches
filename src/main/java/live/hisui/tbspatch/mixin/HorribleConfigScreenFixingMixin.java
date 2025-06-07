package live.hisui.tbspatch.mixin;

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

@Mixin(value = ConfigScreen.class, remap = false)
public abstract class HorribleConfigScreenFixingMixin extends AbstractContainerScreen<ConfigMenu> {
    @Shadow @Final private Level world;

    public HorribleConfigScreenFixingMixin(ConfigMenu p_97741_, Inventory p_97742_, Component p_97743_) {
        super(p_97741_, p_97742_, p_97743_);
    }

    @ModifyArg(method = "init", at = @At(value = "INVOKE",
            target = "Lnet/minecraft/client/gui/components/Checkbox;<init>(IIIILnet/minecraft/network/chat/Component;Z)V",
            ordinal = 0)
    )
    private boolean unfuck0(boolean original){
        return ThebrokenscriptModVariables.MapVariables.get(this.world).config_noentitiesspawn;
    }
    @ModifyArg(method = "init", at = @At(value = "INVOKE",
            target = "Lnet/minecraft/client/gui/components/Checkbox;<init>(IIIILnet/minecraft/network/chat/Component;Z)V",
            ordinal = 1)
    )
    private boolean unfuck1(boolean original){
        return ThebrokenscriptModVariables.MapVariables.get(this.world).config_randomevents;
    }
    @ModifyArg(method = "init", at = @At(value = "INVOKE",
            target = "Lnet/minecraft/client/gui/components/Checkbox;<init>(IIIILnet/minecraft/network/chat/Component;Z)V",
            ordinal = 2)
    )
    private boolean unfuck2(boolean original){
        return ThebrokenscriptModVariables.MapVariables.get(this.world).config_nocrashes;
    }
    @ModifyArg(method = "init", at = @At(value = "INVOKE",
            target = "Lnet/minecraft/client/gui/components/Checkbox;<init>(IIIILnet/minecraft/network/chat/Component;Z)V",
            ordinal = 3)
    )
    private boolean unfuck3(boolean original){
        return ThebrokenscriptModVariables.MapVariables.get(this.world).config_norandomjumpscare;
    }
    @ModifyArg(method = "init", at = @At(value = "INVOKE",
            target = "Lnet/minecraft/client/gui/components/Checkbox;<init>(IIIILnet/minecraft/network/chat/Component;Z)V",
            ordinal = 4)
    )
    private boolean unfuck4(boolean original){
        return ThebrokenscriptModVariables.MapVariables.get(this.world).config_norandomstructures;
    }
    @ModifyArg(method = "init", at = @At(value = "INVOKE",
            target = "Lnet/minecraft/client/gui/components/Checkbox;<init>(IIIILnet/minecraft/network/chat/Component;Z)V",
            ordinal = 5)
    )
    private boolean unfuck5(boolean original){
        return ThebrokenscriptModVariables.MapVariables.get(this.world).showvhs;
    }
    @ModifyArg(method = "init", at = @At(value = "INVOKE",
            target = "Lnet/minecraft/client/gui/components/Checkbox;<init>(IIIILnet/minecraft/network/chat/Component;Z)V",
            ordinal = 6)
    )
    private boolean unfuck6(boolean original){
        return ThebrokenscriptModVariables.MapVariables.get(this.world).config_noban;
    }
    @ModifyArg(method = "init", at = @At(value = "INVOKE",
            target = "Lnet/minecraft/client/gui/components/Checkbox;<init>(IIIILnet/minecraft/network/chat/Component;Z)V",
            ordinal = 7)
    )
    private boolean unfuck7(boolean original){
        return ThebrokenscriptModVariables.MapVariables.get(this.world).config_noblockbreaking;
    }
    @ModifyArg(method = "init", at = @At(value = "INVOKE",
            target = "Lnet/minecraft/client/gui/components/Checkbox;<init>(IIIILnet/minecraft/network/chat/Component;Z)V",
            ordinal = 8)
    )
    private boolean unfuck(boolean original){
        return ThebrokenscriptModVariables.MapVariables.get(this.world).config_nobaseexplode;
    }

}
