package live.hisui.tbspatch.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
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
public class DontResetDayOnTimeChangeMixin {

    @WrapOperation(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
    at = @At(value = "INVOKE", target = "Lnet/minecraft/server/level/ServerLevel;setDayTime(J)V"))
    private static void inj(ServerLevel instance, long timeToSet, Operation<Void> original){
        long dayTime = instance.getDayTime();
        long currentDay = dayTime / 24000;
        long newTime = currentDay * 24000 + timeToSet;
        instance.setDayTime(newTime);
    }

    @WrapOperation(method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)V",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/commands/Commands;performPrefixedCommand(Lnet/minecraft/commands/CommandSourceStack;Ljava/lang/String;)I"))
    private static int inj(Commands instance, CommandSourceStack pSource, String pCommand, Operation<Integer> original, @Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity){
        int timeToBe = 0;
        if(pCommand.equals("time set day")){
            timeToBe = 0;
        } else if(pCommand.equals("time set night")) {
            timeToBe = 13000;
        } else if(pCommand.equals("time set midnight")){
            timeToBe = 18000;
        } else {
            return original.call(instance, pSource, pCommand);
        }
        if(world instanceof ServerLevel sl) {
            long dayTime = sl.getDayTime();
            long currentDay = dayTime / 24000;
            long newTime = currentDay * 24000 + timeToBe;
            sl.setDayTime(newTime);
        }
        return 0;
    }

}
