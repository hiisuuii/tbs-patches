package live.hisui.tbspatch.mixin.fixes.time;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import live.hisui.tbspatch.util.Util;
import net.mcreator.interpritation.procedures.TheBrokenEndOnInitialEntitySpawnProcedure;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.LevelAccessor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(TheBrokenEndOnInitialEntitySpawnProcedure.class)
public class BrokenEndSpawnProcMixin {

    @WrapOperation(method = "execute",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/commands/Commands;performPrefixedCommand(Lnet/minecraft/commands/CommandSourceStack;Ljava/lang/String;)I", ordinal = 0))
    private static int timeSetMidnight(Commands instance, CommandSourceStack pSource, String pCommand, Operation<Integer> original, LevelAccessor world){
        if(world instanceof ServerLevel sl) {
            sl.setDayTime(Util.getNextTime(sl,"midnight"));
        }
        return 0;
    }
}
