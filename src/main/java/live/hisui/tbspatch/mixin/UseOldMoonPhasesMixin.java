package live.hisui.tbspatch.mixin;

import net.mcreator.interpritation.procedures.MoonDevoidsProcedure;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(MoonDevoidsProcedure.class)
public class UseOldMoonPhasesMixin {

    @ModifyArg(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;)V",
    at = @At(value = "INVOKE", target = "Lnet/minecraft/resources/ResourceLocation;<init>(Ljava/lang/String;)V",ordinal = 0))
    private static String inj0(String pLocation){
        return "thebrokenscript:textures/moonevent/moon_phases_old";
    }

    @ModifyArg(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;)V",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/resources/ResourceLocation;<init>(Ljava/lang/String;)V",ordinal = 2))
    private static String inj2(String pLocation){
        return "thebrokenscript:textures/moonevent/moon_phases_old";
    }
}
