package live.hisui.tbspatch.mixin.fixes.time;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import live.hisui.tbspatch.util.Util;
import net.mcreator.interpritation.procedures.EventEngineProcedure;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.eventbus.api.Event;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import javax.annotation.Nullable;

@Mixin(EventEngineProcedure.class)
public class EventEngineMixin {

    @WrapOperation(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
    at = @At(value = "INVOKE", target = "Lnet/minecraft/server/level/ServerLevel;setDayTime(J)V"))
    private static void dontChangeDayWithCode(ServerLevel instance, long timeToSet, Operation<Void> original){
        long dayTime = instance.getDayTime();
        long currentDay = dayTime / 24000;
        long newTime = currentDay * 24000 + timeToSet;
        instance.setDayTime(newTime);
    }

    @WrapOperation(method = "lambda$execute$5",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/commands/Commands;performPrefixedCommand(Lnet/minecraft/commands/CommandSourceStack;Ljava/lang/String;)I", ordinal = 0))
    private static int timeSetMidnight1(Commands instance, CommandSourceStack pSource, String pCommand, Operation<Integer> original, LevelAccessor world){
        if(world instanceof ServerLevel sl) {
            sl.setDayTime(Util.getNextTime(sl, "midnight"));
        }
        return 0;
    }
    @WrapOperation(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/commands/Commands;performPrefixedCommand(Lnet/minecraft/commands/CommandSourceStack;Ljava/lang/String;)I", ordinal = 0))
    private static int timeSetNight1(Commands instance, CommandSourceStack pSource, String pCommand, Operation<Integer> original, @Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity){
        if(world instanceof ServerLevel sl) {
            sl.setDayTime(Util.getNextTime(sl, "night"));
        }
        return 0;
    }
    @WrapOperation(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/commands/Commands;performPrefixedCommand(Lnet/minecraft/commands/CommandSourceStack;Ljava/lang/String;)I", ordinal = 17))
    private static int timeSetMidnight2(Commands instance, CommandSourceStack pSource, String pCommand, Operation<Integer> original, @Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity){
        if(world instanceof ServerLevel sl) {
            sl.setDayTime(Util.getNextTime(sl, "midnight"));
        }
        return 0;
    }
    @WrapOperation(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/commands/Commands;performPrefixedCommand(Lnet/minecraft/commands/CommandSourceStack;Ljava/lang/String;)I", ordinal = 18))
    private static int timeSetDay1(Commands instance, CommandSourceStack pSource, String pCommand, Operation<Integer> original, @Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity){
        if(world instanceof ServerLevel sl) {
            sl.setDayTime(Util.getNextTime(sl, "day"));
        }
        return 0;
    }
    @WrapOperation(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/commands/Commands;performPrefixedCommand(Lnet/minecraft/commands/CommandSourceStack;Ljava/lang/String;)I", ordinal = 19))
    private static int timeSetMidnight3(Commands instance, CommandSourceStack pSource, String pCommand, Operation<Integer> original, @Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity){
        if(world instanceof ServerLevel sl) {
            sl.setDayTime(Util.getNextTime(sl, "midnight"));
        }
        return 0;
    }

}
