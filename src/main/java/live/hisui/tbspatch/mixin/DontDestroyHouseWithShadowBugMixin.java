package live.hisui.tbspatch.mixin;

import com.llamalad7.mixinextras.expression.Definition;
import com.llamalad7.mixinextras.expression.Expression;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import live.hisui.tbspatch.TBSPatchMod;
import net.mcreator.interpritation.procedures.EventEngineProcedure;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Debug(export = true)
@Mixin(EventEngineProcedure.class)
public class DontDestroyHouseWithShadowBugMixin {

    @Definition(id = "eventengine", local = @Local(name = "eventengine"))
    @Expression("eventengine == 54.0")
    @ModifyExpressionValue(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
    at = @At("MIXINEXTRAS:EXPRESSION"), remap = false)
    private static boolean never(boolean original) {
        TBSPatchMod.LOGGER.info("Shadow event triggered: {}", original);
        return original;
    }

}
