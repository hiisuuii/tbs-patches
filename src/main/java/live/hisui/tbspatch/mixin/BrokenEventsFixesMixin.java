package live.hisui.tbspatch.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.mcreator.interpritation.network.ThebrokenscriptModVariables;
import net.mcreator.interpritation.procedures.EventEngineProcedure;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Slice;

@Mixin(EventEngineProcedure.class)
public class BrokenEventsFixesMixin {

    @WrapOperation(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
    slice = @Slice(
            from = @At(value = "FIELD", opcode = Opcodes.GETFIELD, target = "Lnet/mcreator/interpritation/network/ThebrokenscriptModVariables$MapVariables;moonphase:D")
    ), at = @At(value = "FIELD", opcode = Opcodes.PUTFIELD, target = "Lnet/mcreator/interpritation/network/ThebrokenscriptModVariables$MapVariables;moonphase:D"), remap = false)
    private static void inj(ThebrokenscriptModVariables.MapVariables instance, double value, Operation<Void> original){
        if(instance.moonphase >= 2.0){
            instance.moonphase = 0;
        } else {
            instance.moonphase += 1.0;
        }
    }
}
