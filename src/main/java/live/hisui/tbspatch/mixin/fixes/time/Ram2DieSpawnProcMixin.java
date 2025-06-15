package live.hisui.tbspatch.mixin.fixes.time;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import live.hisui.tbspatch.util.Util;
import net.mcreator.interpritation.procedures.Xxram2dieOnInitialEntitySpawnProcedure;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.LevelAccessor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(Xxram2dieOnInitialEntitySpawnProcedure.class)
public class Ram2DieSpawnProcMixin {

    @WrapOperation(method = "lambda$execute$1",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/commands/Commands;performPrefixedCommand(Lnet/minecraft/commands/CommandSourceStack;Ljava/lang/String;)I", ordinal = 1))
    private static int timeSetMidnight1(Commands instance, CommandSourceStack pSource, String pCommand, Operation<Integer> original, LevelAccessor world){
        if(world instanceof ServerLevel sl) {
            sl.setDayTime(Util.getNextTime(sl,"midnight"));
        }
        return 0;
    }

    @WrapOperation(method = "lambda$execute$2",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/commands/Commands;performPrefixedCommand(Lnet/minecraft/commands/CommandSourceStack;Ljava/lang/String;)I", ordinal = 1))
    private static int timeSetMidnight2(Commands instance, CommandSourceStack pSource, String pCommand, Operation<Integer> original, LevelAccessor world){
        if(world instanceof ServerLevel sl) {
            sl.setDayTime(Util.getNextTime(sl,"midnight"));
        }
        return 0;
    }

    @WrapOperation(method = "lambda$execute$3",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/commands/Commands;performPrefixedCommand(Lnet/minecraft/commands/CommandSourceStack;Ljava/lang/String;)I", ordinal = 1))
    private static int timeSetMidnight3(Commands instance, CommandSourceStack pSource, String pCommand, Operation<Integer> original, LevelAccessor world){
        if(world instanceof ServerLevel sl) {
            sl.setDayTime(Util.getNextTime(sl,"midnight"));
        }
        return 0;
    }

    @WrapOperation(method = "lambda$execute$4",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/commands/Commands;performPrefixedCommand(Lnet/minecraft/commands/CommandSourceStack;Ljava/lang/String;)I", ordinal = 1))
    private static int timeSetMidnight4(Commands instance, CommandSourceStack pSource, String pCommand, Operation<Integer> original, LevelAccessor world){
        if(world instanceof ServerLevel sl) {
            sl.setDayTime(Util.getNextTime(sl,"midnight"));
        }
        return 0;
    }

    @WrapOperation(method = "lambda$execute$5",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/commands/Commands;performPrefixedCommand(Lnet/minecraft/commands/CommandSourceStack;Ljava/lang/String;)I", ordinal = 1))
    private static int timeSetMidnight5(Commands instance, CommandSourceStack pSource, String pCommand, Operation<Integer> original, LevelAccessor world){
        if(world instanceof ServerLevel sl) {
            sl.setDayTime(Util.getNextTime(sl,"midnight"));
        }
        return 0;
    }
}
