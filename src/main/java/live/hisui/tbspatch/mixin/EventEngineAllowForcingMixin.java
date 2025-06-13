package live.hisui.tbspatch.mixin;

import live.hisui.tbspatch.TBSPatchMod;
import net.mcreator.interpritation.procedures.EventEngineProcedure;
import org.checkerframework.checker.units.qual.A;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Debug(export = true)
@Mixin(EventEngineProcedure.class)
public class EventEngineAllowForcingMixin {

    @ModifyVariable(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/util/Mth;nextInt(Lnet/minecraft/util/RandomSource;II)I", shift = At.Shift.AFTER),
            ordinal = 6,
            remap = false,
    print = false)
    private static double overrideIfForced(double original) {
        TBSPatchMod.LOGGER.info("Successfully mixin forcing the eventengine ID");
        if(TBSPatchMod.forcedEventID != null) {
            TBSPatchMod.LOGGER.info("We have found a forced event ID");
            double value = TBSPatchMod.forcedEventID.get();
            TBSPatchMod.forcedEventID = null;
            TBSPatchMod.LOGGER.info("The forced event ID is: {}", value);
            return value;
        } else {
            TBSPatchMod.LOGGER.info("We have NOT found a forced event ID");
            return original;
        }
    }
}
