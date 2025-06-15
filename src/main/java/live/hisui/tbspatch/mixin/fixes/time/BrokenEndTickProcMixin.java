package live.hisui.tbspatch.mixin.fixes.time;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import live.hisui.tbspatch.util.Util;
import net.mcreator.interpritation.procedures.TheBrokenEndOnEntityTickUpdateProcedure;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.LevelAccessor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(TheBrokenEndOnEntityTickUpdateProcedure.class)
public class BrokenEndTickProcMixin {
    @WrapOperation(method = "execute",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/commands/Commands;performPrefixedCommand(Lnet/minecraft/commands/CommandSourceStack;Ljava/lang/String;)I", ordinal = 1))
    private static int timeSetMidnight(Commands instance, CommandSourceStack pSource, String pCommand, Operation<Integer> original, LevelAccessor world){
        if(world instanceof ServerLevel sl) {
            sl.setDayTime(Util.getNextTime(sl,"midnight"));
        }
        return 0;
    }
    @WrapOperation(method = "execute",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/commands/Commands;performPrefixedCommand(Lnet/minecraft/commands/CommandSourceStack;Ljava/lang/String;)I", ordinal = 2))
    private static int timeSetDay1(Commands instance, CommandSourceStack pSource, String pCommand, Operation<Integer> original, LevelAccessor world){
        if(world instanceof ServerLevel sl) {
            sl.setDayTime(Util.getNextTime(sl,"day"));
        }
        return 0;
    }
    @WrapOperation(method = "execute",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/commands/Commands;performPrefixedCommand(Lnet/minecraft/commands/CommandSourceStack;Ljava/lang/String;)I", ordinal = 3))
    private static int timeSetDay2(Commands instance, CommandSourceStack pSource, String pCommand, Operation<Integer> original, LevelAccessor world){
        if(world instanceof ServerLevel sl) {
            sl.setDayTime(Util.getNextTime(sl,"day"));
        }
        return 0;
    }
}
