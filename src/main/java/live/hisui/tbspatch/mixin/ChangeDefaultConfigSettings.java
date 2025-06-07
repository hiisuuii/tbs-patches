package live.hisui.tbspatch.mixin;

import live.hisui.tbspatch.Config;
import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
import net.minecraft.nbt.CompoundTag;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = ThebrokenscriptModVariables.MapVariables.class, remap = false)
public abstract class ChangeDefaultConfigSettings {

    @Shadow
    public boolean config_nocrashes;
    @Shadow
    public boolean config_noban;
    @Shadow
    public boolean showvhs;
    @Shadow public boolean config_nobaseexplode;

    @Inject(method = "<init>", at = @At("TAIL"))
    public void inj(CallbackInfo ci){
        if(Config.disableCrashingByDefault) {
            this.config_nocrashes = true;
        }
        if(Config.disableBanningByDefault) {
            this.config_noban = true;
        }
        if(Config.disableVhsByDefault) {
            this.showvhs = false;
        }
        if(Config.disableBaseExplodingByDefault){
            this.config_nobaseexplode = true;
        }
    }
}
