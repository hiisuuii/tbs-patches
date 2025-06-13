package live.hisui.tbspatch.mixin;

import live.hisui.tbspatch.Config;
import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = ThebrokenscriptModVariables.MapVariables.class, remap = false)
public abstract class ChangeDefaultConfigSettings {

    @Shadow public boolean config_nocrashes;
    @Shadow public boolean config_noban;
    @Shadow public boolean showvhs;
    @Shadow public boolean config_nobaseexplode;

    @Shadow public boolean config_noentitiesspawn;

    @Shadow public boolean config_randomevents;

    @Shadow public boolean config_norandomjumpscare;

    @Shadow public boolean config_norandomstructures;

    @Shadow public boolean config_noblockbreaking;

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
        if(Config.disableEntitiesByDefault){
            this.config_noentitiesspawn = true;
        }
        if(Config.disableEventsByDefault){
            this.config_randomevents = false;
        }
        if(Config.disableJumpscaresByDefault){
            this.config_norandomjumpscare = true;
        }
        if(Config.disableStructuresByDefault){
            this.config_norandomstructures = true;
        }
        if(Config.disableBlockBreakingByDefault){
            this.config_noblockbreaking = true;
        }

    }
}
