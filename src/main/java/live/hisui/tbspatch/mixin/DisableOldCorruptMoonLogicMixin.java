package live.hisui.tbspatch.mixin;

import net.mcreator.interpritation.procedures.MoonDevoidsProcedure;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.eventbus.api.Event;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MoonDevoidsProcedure.class)
public class DisableOldCorruptMoonLogicMixin {

    @Inject(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;)V",
    at = @At("HEAD"), cancellable = true, remap = false)
    private static void cancel(Event event, LevelAccessor world, CallbackInfo ci){
        ci.cancel();
    }
}
