package live.hisui.tbspatch.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import live.hisui.tbspatch.TBSPatchMod;
import net.mcreator.interpritation.procedures.EventEngineProcedure;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Debug(export = true)
@Mixin(EventEngineProcedure.class)
public class EventEngineAllowForcingMixin {


    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
    at = @At(value = "INVOKE", target = "Lnet/minecraft/util/Mth;nextInt(Lnet/minecraft/util/RandomSource;II)I"))
    private static int overrideIfForced(int original) {
        if(TBSPatchMod.forcedEventID != null) {
            int value = TBSPatchMod.forcedEventID.get();
            TBSPatchMod.forcedEventID = null;
            return value;
        } else {
            return original;
        }
    }

    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D"), remap = false)
    private static double guarantee(double original) {
        if(TBSPatchMod.riggedEventChance.get()) {
            TBSPatchMod.riggedEventChance.set(false);
            return 0.0;
        } else {
            return original;
        }
    }
}
